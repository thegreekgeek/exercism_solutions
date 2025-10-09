public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double cars = speed * 221;
        double successRate = 0;
        double goodCars;
        if (speed <= 4) {
            successRate = 1;
        } else if (speed >= 5 && speed <= 8) {
            successRate = 0.9;
        } else if (speed == 9) {
            successRate = 0.8;
        } else {
            successRate = 0.77;
        }
        return goodCars = cars * successRate;

        //throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
    }

    public int workingItemsPerMinute(int speed) {
        return (int)Math.floor(productionRatePerHour(speed) / 60);

        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
    }
}
