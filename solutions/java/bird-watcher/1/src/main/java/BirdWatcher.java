
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = {0,2,5,3,7,8,4};
        return lastWeek;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        boolean noBirds = false;
        for (int day : birdsPerDay) {
            if (day == 0){
                noBirds = true;
                break;
            } 
        } return noBirds;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        }
    

    public int getCountForFirstDays(int numberOfDays) {
        int sightings = 0;
        for (int i=0; i < numberOfDays; i++) {
            if (i < birdsPerDay.length) {
                sightings += birdsPerDay[i];
            } else if (i > birdsPerDay.length) {
                break;
            }
            
        }
        return sightings;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int day : birdsPerDay) {
            if (day >= 5) {
                busyDays += 1;
            } else {
                continue;
            }
        }
        return busyDays;
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
    }
}
