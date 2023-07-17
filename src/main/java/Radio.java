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

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }


    public void setStation(int newStation) {
        station = newStation;

    }


    public void nextStation1() {
        int nextStation = station;

        if (nextStation == maxStation) {
            station = nextStation = 0;
        }
        else {
            station = nextStation + 1;
        }

    }

    public void prevStation() {
        int prevStation = station;
        if (prevStation == minStation) {
            station = prevStation = 9;
            return;
        }
        else {
            station = prevStation -1;
        }

    }


    public void setIncreaseVolume(int newIncreaseVolume) {
        currentVolume = newIncreaseVolume;

    }


    public void increaseVolumeOn1() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        }
        else  {
            currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        }
        else   {
            currentVolume = currentVolume - 1;
        }
    }


}


