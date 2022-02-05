package observer;

public abstract class Observer {
    protected Topic topic;

    public abstract void update();
}
