package by.itstep.karnei.deadlock;

public class DeadLock {

    public static void main(String[] args) {
        final Friend aleksandr =
                new Friend("Aleksandr");
        final Friend roman =
                new Friend("Roman");
        new Thread(() -> aleksandr.lockFriend(roman)).start();
        new Thread(() -> roman.lockFriend(aleksandr)).start();
    }
}
