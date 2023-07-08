public class Radio {

    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int station;
    private int currentVolume;


    public Radio() {
        maxStation = 9;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation > maxStation) {
            return;
        }
        if (newStation < minStation) {
            return;
        }
        station = newStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void nextStation1() {
        int nextStation = station;
        if (nextStation < maxStation) {
            station = nextStation + 1;
            return;
        }
        if (nextStation == maxStation) {
            station = nextStation = 0;
        }

    }

    public void prevStation() {
        int prevStation = station;
        if (prevStation == minStation) {
            station = prevStation = 9;
            return;
        }
        if (prevStation <= maxStation) {
            station = prevStation - 1;
            return;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }


    public void setIncreaseVolume(int newIncreaseVolume) {
        if (newIncreaseVolume <= maxVolume) {
            currentVolume = newIncreaseVolume;
        }
        if (newIncreaseVolume == minVolume) {
            currentVolume = newIncreaseVolume;
        }
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }


    public void increaseVolumeOn1() {
        if (currentVolume >= minVolume) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
            return;
        }
    }

    public void turnDownVolume() {
        if (currentVolume <= maxVolume) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        }
    }
}




