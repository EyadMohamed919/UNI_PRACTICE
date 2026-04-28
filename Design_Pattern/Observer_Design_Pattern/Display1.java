package Design_Pattern.Observer_Design_Pattern;

public class Display1 implements IObserver {

    ISubject refSubject;

    public Display1(ISubject x) {
        refSubject = x;
        refSubject.addObserver(this);
    }

    public void updateInterface() {
        System.out.println("Observerdp1.Display.updateInterface");
    }

}
