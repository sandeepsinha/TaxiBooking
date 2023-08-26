package service;

public class PrintInfo implements PrinterInterface{

    @Override
    public void print(String printInfo) {
        System.out.println(printInfo);
    }
}
