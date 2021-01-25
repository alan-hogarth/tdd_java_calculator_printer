public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int volFull(){
        return this.volume;
    }

    public int drink() {
        return volume -= 10;
    }

    public int empty() {
        return volume = 0;
    }

    public int fill() {
        return volume = 100;
        }
}
