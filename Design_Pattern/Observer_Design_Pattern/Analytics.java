package Design_Pattern.Observer_Design_Pattern;

public class Analytics implements IObserver {

    ISubject refSubject;

    public Analytics(ISubject x) {
        refSubject = x;
        refSubject.addObserver(this);
    }

    public void updateInterface() {
        System.out.println("Analytics");
    }

}
