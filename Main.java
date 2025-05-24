public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volkswagen", "XXXX-3000",2017, 0);
        Moto moto = new Moto("Honda", "JkL - 2300G", 2019, "O top dos tops");

        car.setNumDoors(4);
        moto.setHandlebar("Mais top dos tops dos tops");

        car.displayDetails();
        System.out.println();
        moto.displayDetails();
    }
}
