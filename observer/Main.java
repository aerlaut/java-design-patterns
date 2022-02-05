package observer;

import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Topic> topics = new HashMap<String, Topic>();
        Scanner scanner = new Scanner(System.in);

        int subscriberId = 0;

        String input, message;
        Topic topic = null;

        String command = "";
        String topicName = "";

        while (true) {

            System.out.println();
            System.out.println(
                    "Add a new topic (-t name), create a subscriber (-s topic_name), or notify subscribers (-n topic_name message)");
            input = scanner.nextLine();
            String[] inputArr = input.split(" ");

            List<String> inputTokens = new ArrayList<>();

            for (int i = 0; i < inputArr.length; i++) {
                inputTokens.add(inputArr[i]);
            }

            try {
                command = inputTokens.remove(0);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No command given, exiting...");
                System.exit(0);
            }

            switch (command) {

                case "-t":

                    try {
                        topicName = inputTokens.remove(0);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("No topic name given");
                        break;
                    }

                    Topic newTopic = new Topic(topicName);

                    topics.put(topicName, newTopic);

                    System.out.println("New topic \"" + topicName + "\" created");
                    break;

                case "-s":

                    try {
                        topicName = inputTokens.remove(0);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("No topic name given");
                        break;
                    }

                    // Topic can not contain space, for simplicity
                    if (topicName.contains(" ")) {
                        System.out.println("Topic name can not contain spaces");
                        break;
                    }

                    if (!topics.containsKey(topicName)) {
                        System.out.println("Topic does not exist, skipping subscriber creation");
                        break;
                    }

                    topic = topics.get(topicName);

                    new Subscriber("s-" + subscriberId, topic);

                    System.out.println("New subscriber added to " + topicName);
                    System.out.println(topic.getNumSubscribers() + " subscribers in " + topicName);

                    subscriberId += 1;
                    break;

                case "-n":

                    try {
                        topicName = inputTokens.remove(0);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("No topic name given");
                        break;
                    }

                    message = String.join(" ", inputTokens);

                    if (!topics.containsKey(topicName)) {
                        System.out.println(
                                "Topic does not exist. Create a new one using -t topic_name");
                    }

                    if (message.isEmpty()) {
                        message = "Message is empty";
                    }

                    topic = topics.get(topicName);
                    topic.publish(message);
                    break;

                case "exit":
                    System.out.print("Bye bye");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command. Exiting");
                    scanner.close();
                    System.exit(0);
                    break;

            }
        }

    }

}
