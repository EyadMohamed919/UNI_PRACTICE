package Design_Pattern.Observer_Design_Pattern;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject {
    ArrayList<IObserver> ListOfObservers;

    public ConcreteSubject() {
        ListOfObservers = new ArrayList<IObserver>();
    }

    public void addObserver(IObserver x) {
        ListOfObservers.add(x);
    }

    public void NotifyAllObservers() {
        for (int i = 0; i < ListOfObservers.size(); i++) {
            ListOfObservers.get(i).updateInterface();
        }
    }

    public void removeObserver(IObserver x) {
        ListOfObservers.remove(x);
    }
}
