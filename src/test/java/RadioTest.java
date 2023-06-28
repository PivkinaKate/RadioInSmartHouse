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
    public void TurnOnRadioStation1(){
        Radio stat = new Radio();

        stat.setStation(1);

        int expected = 1;
        int actual = stat.getStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnRadioStation0(){
        Radio stat = new Radio();

        stat.setStation(0);

        int expected = 0;
        int actual = stat.getStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnRadioStation9(){
        Radio stat = new Radio();

        stat.setStation(9);

        int expected = 9;
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
        stat.setStation(9);

        stat.nextStation1();

        int expected = 0;
        int actual = stat.getStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOfNextStation2() {
        Radio stat = new Radio();
        stat.setStation(0);

        stat.nextStation1();

        int expected = 1;
        int actual = stat.getStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOfNextStation9() {
        Radio stat = new Radio();
        stat.setStation(8);

        stat.nextStation1();

        int expected = 9;
        int actual = stat.getStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnPrevStation1() {
        Radio stat = new Radio();
        stat.setStation(9);

        stat.prevStation();

        int expected = 8;
        int actual = stat.getStation();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnPrevStation9() {
        Radio stat = new Radio();
        stat.setStation(0);

        stat.prevStation();

        int expected = 9;
        int actual = stat.getStation();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TurnOnPrevStation0() {
        Radio stat = new Radio();
        stat.setStation(1);

        stat.prevStation();

        int expected = 0;
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
    public void TurnOnIncreaseVolume100() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnIncreaseVolume99() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnIncreaseVolume14() {
        Radio volume = new Radio();

        volume.setIncreaseVolume(14);

        int expected = 14;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }


    @Test
    public void TurnOnIncreaseVolume10() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(9);

        volume.increaseVolumeOn1();

        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnIncreaseVolume100_0() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(99);

        volume.increaseVolumeOn1();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnIncreaseVolume100_1() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(100);

        volume.increaseVolumeOn1();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TurnOnIncreaseVolume1() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(0);

        volume.increaseVolumeOn1();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }



    @Test
    public void TestTurnDownVolume0() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(0);

        volume.turnDownVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void TestTurnDownVolume49() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(50);

        volume.turnDownVolume();

        int expected = 49;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void TestTurnDownVolume100() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(100);

        volume.turnDownVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void TestTurnDownVolume1() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(1);

        volume.turnDownVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected,actual);

    }

}

