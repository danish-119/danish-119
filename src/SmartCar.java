public class SmartCar extends Car implements  MediaPlayer {

    @Override
    void Start() {
        System.out.println("Starting SmartCar...");
    }

    @Override
    void Stop() {
        System.out.println("Stopping SmartCar...");
    }

    @Override
    public void play() {
        System.out.println("Playing Music in SmartCar...");
    }

    @Override
    public void pause() {
        System.out.println("Pausing Music in SmartCar...");
    }
}
