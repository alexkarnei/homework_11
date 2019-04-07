package by.itstep.karnei.whitelock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Friend extends by.itstep.karnei.deadlock.Friend {

    private final Lock lock = new ReentrantLock();

    public Friend(String name) {
        super(name);
    }


    public boolean impendingLock(Friend locker) {
        boolean myLock = false;
        boolean yourLock = false;
        try {
            myLock = lock.tryLock();
            yourLock = locker.lock.tryLock();
        } finally {
            if (!(myLock && yourLock)) {
                if (myLock) {
                    lock.unlock();
                }
                if (yourLock) {
                    locker.lock.unlock();
                }
            }
        }
        return myLock && yourLock;
    }

    public void lockedFriend(Friend locker) {
        if (impendingLock(locker)) {
            try {
                System.out.format("%s: %s has"
                                + " locked to me!%n",
                        this.name, locker.getName());
                locker.unLockerFriend(this);
            } finally {
                lock.unlock();
                locker.lock.unlock();
            }
        } else {
            System.out.format("%s: %s started"
                            + " to lock to me, but saw that"
                            + " I was already locking to"
                            + " him.%n",
                    this.name, locker.getName());
        }
    }
}

