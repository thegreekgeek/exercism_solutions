public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int timesDriven = 0;
    
    public void drive() {
        timesDriven += 1;
    }

    public int getDistanceTravelled() {
        return timesDriven * 20;
    }
}
