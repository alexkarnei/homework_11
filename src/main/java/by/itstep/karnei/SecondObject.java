package by.itstep.karnei;

public class SecondObject {

    synchronized public void firstMethod(FirstObject firstObject) {
        String nameThread = Thread.currentThread().getName();
        System.out.println(nameThread + " has entered in method SecondObject.firstMethod");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Class SecondObject interrupted");
        }
        System.out.println(nameThread + " trying to call SecondObject.secondMethod");
        firstObject.secondMethod();
    }

    synchronized public void secondMethod() {
        System.out.println("In method SecondObject.secondMethod");
    }
}
