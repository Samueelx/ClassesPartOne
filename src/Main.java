//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setMake("Mercedes-Benz");
        car.setModel("S500");
        car.setColour("Gray");
        car.setDoors(4);
        car.setConvertible(true);
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();
    }
}