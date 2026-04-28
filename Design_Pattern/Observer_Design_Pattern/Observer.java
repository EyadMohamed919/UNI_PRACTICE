package Design_Pattern.Observer_Design_Pattern;

public class Observer {
    public static void main(String[] args) {
        ConcreteSubject Anthony = new ConcreteSubject();
        Display1 MyForm1 = new Display1(Anthony);
        Display2 MyForm2 = new Display2(Anthony);
        Analytics MyForm3 = new Analytics(Anthony);
        Anthony.NotifyAllObservers();
    }
}
