class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int batteryCap;
    static final int NITRO_SPEED = 50;
    static final int NITRO_DRAIN = 4;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.batteryCap = 100;
        this.distanceDriven= 0;
    }

    public boolean batteryDrained() {
        return batteryCap < batteryDrain;
    }
    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain() {
        return batteryDrain;
    }
    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            batteryCap -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(NITRO_SPEED, NITRO_DRAIN);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        int maxDistance = (100 / car.getBatteryDrain()) * car.getSpeed();
        return maxDistance >= distance;
        
    }
}
