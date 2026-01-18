public class Car {
    private ElectricEngine electricEngine;
    private GasolineEngine gasolineEngine;
    
    public Car() {
        this.electricEngine = new ElectricEngine();
        this.gasolineEngine = new GasolineEngine();
    }

    public void startGasolineEngine(){
        gasolineEngine.start();
    }

    public void startElectricEngine(){
        electricEngine.start();
    }

    public static void main(String[] args) {
        Car car = new Car();

        car.startGasolineEngine();
        car.startElectricEngine();
    }
}
