package observer;

import java.util.List;
import java.util.ArrayList;

public class Topic {
    private List<Observer> subscribers = new ArrayList<>();

    private String topicName;
    private String message;

    public Topic(String name) {
        this.topicName = name;
    }

    public void subscribe(Observer s) {
        subscribers.add(s);
    }

    public void publish(String message) {
        this.message = message;
        notifySubscribers();
    }

    public void notifySubscribers() {
        for (Observer sub : subscribers) {
            sub.update();
        }
    }

    public String getTopicName() {
        return topicName;
    }

    public String getMessage() {
        return message;
    }

    public int getNumSubscribers() {
        return this.subscribers.size();
    }
}
