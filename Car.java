public class Car {

    private int doors;      // private - cannot access outside the class
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //colour = "black";

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.model = "Carrera";
        System.out.println(porsche.model);

//    public void setModel(String model){
//        this.model = model;
//    }
//
//    public String getModel() {
//        return this.model;
//    }
    }
}
