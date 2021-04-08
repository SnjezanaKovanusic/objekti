package objectives;

public class Tv {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    @Override
    public String toString() {
        return "Tv{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }

    public Tv() {

    }
    public Tv (int channel, int volumeLevel, boolean on){
        this.channel=channel;
        this.volumeLevel=volumeLevel;
        this.on=on;
    }

    public void turnOn() {
        on = true;
        System.out.println("Tv is on");
    }



    public void setChannel(int channel) {
        if (on && channel >= 1 && channel <= 120) {
            this.channel = channel;
            System.out.println("Setovan kanal....");
        }
    }

    public void setVolume(int volumeLevel) {
        if (on && volumeLevel >= 1 && volumeLevel <= 7) {
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumelUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumelDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }
    public void turnOff() {
        on = false;
        System.out.println("Tv is turn off! ");
    }
}
