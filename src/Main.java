//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        car.describeCar();
    }
}