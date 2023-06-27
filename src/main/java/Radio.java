public class Radio {
    private int station;
    private int maxStation;


    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation > 9) {
            return;
        }
        if (newStation < 0) {
            return;
        }
        station = newStation;
    }


    public void nextStation1() {
        int nextStation = station;

        if (nextStation < 9) {
           station = nextStation + 1;
            return;
        }
        if (nextStation == 9) {
          station = nextStation = 0;
        }

    }

    public void prevStation() {
        int prevStation = station;
        if (prevStation >= 9) {
            station = prevStation - 1;
            return;
        }
        if (prevStation == 0) {
            station = prevStation = 9;
        }
    }

    public Radio() {
        maxStation = 9;
    }



    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume <= 0) {
            return;
        }
        if (newIncreaseVolume >= 100) {
            return;
        }
        currentVolume = newIncreaseVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }


    public void increaseVolume1() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= 100) {
            setToMaxVolume();
        }
    }

    public void turnDownVolume() {
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
    }


    }

