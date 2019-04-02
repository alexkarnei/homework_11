package by.itstep.karnei.deadlock;

public class FirstObject {

    synchronized void firstMethod(SecondObject secondObject) {
        String nameThread = Thread.currentThread().getName();
        System.out.println(nameThread + " has entered in method FirstObject.firstMethod");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Class FirstObject interrupted");
        }
        System.out.println(nameThread+" trying to call FirstObject.secondMethod");
        secondObject.secondMethod();
    }
    synchronized void secondMethod(){
        System.out.println("In method FirstObject.secondMethod");
    }
}
