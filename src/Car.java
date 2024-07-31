public class Car {
    private String make = "Mercedes-Benz";
    private String model = "S500";
    private String colour = "Black";
    private boolean isConvertible = false;
    private int doors = 4;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColour(){
        return colour;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public int getDoors() {
        return doors;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                colour + " " + make + " " +
                model + " " + (isConvertible ? "Convertible" : ""));
    }
}
