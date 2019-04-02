package by.itstep.karnei.deadlock;

public class DeadLock {

    FirstObject firstObject = new FirstObject();
    SecondObject secondObject = new SecondObject();

    DeadLock(){
        Thread.currentThread().setName("Main thread");
        Thread thread = new Thread(this::run,"Rival thread");
        thread.start();
        firstObject.firstMethod(secondObject);

        System.out.println("Back to main thread");
    }

    public void run(){
        secondObject.firstMethod(firstObject);
    }

    public static void main(String[] args) {
        new DeadLock();
    }
}
