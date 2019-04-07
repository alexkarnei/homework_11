package by.itstep.karnei.whitelock;

public class LockLoop implements Runnable {
    private Friend locker;
    private Friend lockee;

    public LockLoop(Friend locker, Friend lockee) {
        this.locker = locker;
        this.lockee = lockee;
    }

    public void run() {
        for (; ; ) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            lockee.lockedFriend(locker);
        }
    }
}
