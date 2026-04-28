package Design_Pattern.Observer_Design_Pattern;

public interface ISubject {
    public void addObserver(IObserver x);

    public void NotifyAllObservers();

    public void removeObserver(IObserver x);
}
