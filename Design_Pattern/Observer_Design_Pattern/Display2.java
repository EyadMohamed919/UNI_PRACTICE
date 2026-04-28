package Design_Pattern.Observer_Design_Pattern;

public class Display2 implements IObserver {

    ISubject refSubject;

    public Display2(ISubject x) {
        refSubject = x;
        refSubject.addObserver(this);
    }

    public void updateInterface() {
        System.out.println("Observerdp2.Display.updateInterface");
    }

}
