package Polymorphism.CarRandDCompany;

import java.lang.invoke.SwitchPoint;

public class CarSkeleton {
    private  String name;
    private  String description;

    public CarSkeleton(String name , String description){
        this.name = name;
        this.description = description;
    }
    public String getName(){
        return  name;
    }
    public String getDescription(){
        return  description;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String des){
        description = des;
    }
    public String startEngine(){
        System.out.println("className  : " + getClass().getSimpleName());
        return  getName() + "is starting engine .";
    }
    public String drive(){
        runEngine(this);
        return (getName() + " is driving ...");
    }
    protected  void runEngine( CarSkeleton carSkeleton){
        if(carSkeleton instanceof GasPoweredCar){
            double avg = ((GasPoweredCar) carSkeleton).getAvgKmPerLitre();
            System.out.println("This engine starting with gas. " + "AvgKmPerLitre : " + avg);
        }
        else if(carSkeleton instanceof HybridCar){
            int batSize = ((HybridCar) carSkeleton).getBatterySize();
            int cylinder = ((HybridCar) carSkeleton).getCylinders();
            System.out.println("This engine starting with both electric and gas . " + "Battery - Size : "+batSize + " Cylinder : "+cylinder);
        }
        else if(carSkeleton instanceof  ElectricCar){
            int batSize = ((ElectricCar) carSkeleton).getBatterySize();
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            System.out.println("This engine starting with just electric. " + "Battery - Size : "+batSize + " avgKmPerCharge : " + avgKmPerCharge);
        }
        else System.out.println("This instance is not valid :( ");
    }
    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
