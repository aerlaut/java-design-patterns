package abstract_factory;

public abstract class AbstractAccountFactory {
    abstract Account getAccount(String type);

    abstract String getAvailableServiceTypes();
}
