public class Constructor2 {
    int modelYear;
    String modelName;

    public Constructor2 (int year,String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor2 myObj = new Constructor2(1999,"Porsche");
        System.out.println(myObj.modelYear + " " +myObj.modelName);
    }
}
