public class Car {
    private String brand;
    private String model;
    private int year;
    private int mileage;
    private int fuelLevel;

    //Геттеры
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    // Сеттеры
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = 0;
        this.fuelLevel = 100;
    }
    public void drive(int distance){
        if (distance / 10 <= fuelLevel) {
            mileage += distance;
            fuelLevel -= distance / 10;
        }
        else {
            System.out.println("Недостаточно топлива для поездки на: " + distance + " километр(а, ов)");
        }
    }
    public void refuel(int amount) {
        if (amount + fuelLevel >= 100){
            fuelLevel = 100;
            System.out.println("Бак полон");
        }
        else {
            fuelLevel += amount;
        }
    }
    public void getCarInfo(){
        System.out.println("Марка: "+brand);
        System.out.println("Модель: "+model);
        System.out.println("Год: "+year);
        System.out.println("Пробег: "+mileage);
        System.out.println("Уровень топлива: "+fuelLevel);
    }
}