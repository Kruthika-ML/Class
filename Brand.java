public class Brand {
    String name;
    int price;
    String origin;

    public static void main(String[] args) {
        Brand type = new Brand();
        type.name = "Vero Moda";
        type.origin = "IN";
        type.price = 5000;
        System.out.println(type.name);
        System.out.println(type.origin);
        System.out.println(type.price);
    }
}
