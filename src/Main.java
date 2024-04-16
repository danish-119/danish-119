public class Main {
    public static void main(String[] args) {
        //Car car = new Car();      It will display an error because abstract class can't make object
        Car car = new SmartCar();
        SmartCar smartCar = new SmartCar();

//        smartCar.Start();
//        smartCar.play();
        car.Start();
        car.Stop();


        // We can do this...
        Car car1 = new Car() {
            @Override
            void Start() {

            }

            @Override
            void Stop() {

            }
        };
    }
}