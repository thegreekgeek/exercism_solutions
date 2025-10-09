public class JedliksToyCar {
    public int meterage;
    public int batteryPercentage = 100;
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
        //throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
    }

    public String distanceDisplay() {
        return "Driven " + meterage + " meters";
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        String batteryState = "";
        if (batteryPercentage == 0) {
            batteryState = "Battery empty";
        } else {
             batteryState = "Battery at " + batteryPercentage + "%";
        }
        return batteryState;
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
    }

    public void drive() {
        if (batteryPercentage != 0) {
            batteryPercentage -= 1;
            meterage += 20;
        }
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
    }
}
