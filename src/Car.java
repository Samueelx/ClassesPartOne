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

    public void setMake(String make){
        if(make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "mercedes-benz", "audi", "subaru", "volkswagen" -> this.make = make;
            default ->  this.make = "Unsupported";
        }

    }

    public void setModel(String model){
        this.model = model;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " +
                colour + " " + make + " " +
                model + " " + (isConvertible ? "Convertible" : ""));
    }
}
