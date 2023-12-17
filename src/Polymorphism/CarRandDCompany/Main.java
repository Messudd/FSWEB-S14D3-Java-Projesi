package Polymorphism.CarRandDCompany;

public class Main {
    public static void main(String[] args) {
        CarSkeleton renoEvo = new ElectricCar("RENAULT","evo",80.5,1000);
        CarSkeleton hundai = new HybridCar("HUNDAİ","ves",0.5,500,4);
        CarSkeleton dogan = new GasPoweredCar("TOFAS","dogan",0.8,2);

        System.out.println(dogan.drive());
        hundai.runEngine(hundai);

        System.out.println(renoEvo.getDescription());
        System.out.println(renoEvo.drive());
        System.out.println(hundai.startEngine());

    }
}
