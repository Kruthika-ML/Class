public class CarPractice {
    int number;
    String colour;
    String shape;

    public static void main(String[] args) {
        CarPractice banana = new CarPractice();
        CarPractice mango = new CarPractice();
        banana.colour = "yellow";
        mango.number = 2;
        System.out.println(banana.colour);
        System.out.println(mango.number);
    }
}
