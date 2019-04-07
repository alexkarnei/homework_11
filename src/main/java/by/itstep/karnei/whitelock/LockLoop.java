package by.itstep.karnei.whitelock;

import java.util.Random;

public class LockLoop implements Runnable {
    private Friend locker;
    private Friend lockee;

    public LockLoop(Friend locker, Friend lockee) {
        this.locker = locker;
        this.lockee = lockee;
    }

    public void run() {
        Random random = new Random();
        for (; ; ) {
            try {
                Thread.sleep(random.nextInt(10));
            } catch (InterruptedException e) {
            }
            lockee.lockedFriend(locker);
        }
    }
}
