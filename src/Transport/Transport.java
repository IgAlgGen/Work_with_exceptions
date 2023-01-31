package Transport;

import Drivers.DriverInfo;

import static Transport.Verifications.*;


public abstract class Transport<T extends DriverInfo> implements Emulous {
    private String mark, model;
    private double engineVolume;
    private T driverInfo;

    public Transport(String mark, String model, double engineVolume, T driverInfo) {
        setMark(mark);
        setModel(model);
        setEngineVolume(engineVolume);
        setDriverInfo(driverInfo);
    }

    abstract public void printType();

    public void startMoving() {

    }

    public void finishMoving() {

    }

    public void setDriverInfo(T driverInfo) {
        this.driverInfo = driverInfo;
    }

    public void setMark(String mark) {
        this.mark = verificationMark(mark);
    }

    public void setModel(String model) {
        this.model = verificationModel(model);
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = verificationEngineVolume(engineVolume);
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriverInfo() {
        return driverInfo;
    }

    @Override
    public String toString() {
        return "марка " + mark +
                ", модель " + model +
                ", объем двигателя " + engineVolume;
    }


}
