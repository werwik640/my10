public class Main {
    public static void main(String[] args){
        Car car1 = new Car("Ford", "Focus", 2008);
        Car car2 = new Car("Toyota", "Corolla",2001);
        Car car3 = new Car("Hyundai", "Solaris", 2012);
        car1.drive(50);
        car2.drive(2010);
        System.out.println(car1.getFuelLevel());
        System.out.println(car2.getFuelLevel());
        car2.refuel(50);
        car1.getCarInfo();
        car2.getCarInfo();
        car3.getCarInfo();
    }
}
