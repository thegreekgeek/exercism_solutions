class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int timesDriven = 0;
    private int numVictories = 0;

    public void drive() {
        timesDriven += 1;
    }

    public int getDistanceTravelled() {
        return timesDriven * 10;
    }

    public int getNumberOfVictories() {
        return numVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        numVictories = numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar other) {
        return Integer.compare(other.numVictories, this.numVictories);
    }
}
