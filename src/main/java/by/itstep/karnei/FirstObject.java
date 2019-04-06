package by.itstep.karnei;

public class FirstObject {

    synchronized  public void firstMethod(SecondObject secondObject) {
        String nameThread = Thread.currentThread().getName();
        System.out.println(nameThread + " has entered in method FirstObject.firstMethod");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Class FirstObject interrupted");
        }
        System.out.println(nameThread+" trying to call SecondObject.secondMethod");
        secondObject.secondMethod();
    }
    synchronized public void secondMethod(){
        System.out.println("In method FirstObject.secondMethod");
    }
}
