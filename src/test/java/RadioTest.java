import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void TurnOnRadioStation(){
        Radio stat = new Radio();

        stat.setStation(8);

        int expected = 8;
        int actual = stat.getStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void stRadio() {
        Radio stat = new Radio();

        stat.setStation(10);

        int expected = 0;
        int actual = stat.getStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOfNextStation1() {
        Radio stat = new Radio();
        stat.setStation(4);

        stat.nextStation1();

        int expected = 5;
        int actual = stat.getStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnPrevStation1() {
        Radio stat = new Radio();
        stat.setStation(0);

        stat.prevStation();

        int expected = 9;
        int actual = stat.getStation();
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void TurnOnIncreaseVolume() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnIncreaseVolumeOn1() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(99);

        volume.increaseVolume1();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TestTurnDownVolume() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(50);

        volume.turnDownVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }

}

