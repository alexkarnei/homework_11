package by.itstep.karnei.deadlock;

public class Friend {
    private final String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void lock(Friend locker) {
        System.out.format("%s: %s"
                        + "  has locked to me!%n",
                this.name, locker.getName());
        locker.unLock(this);
    }

    public synchronized void unLock(Friend locker) {
        System.out.format("%s: %s"
                        + " has unLocked to me!%n",
                this.name, locker.getName());
    }

}
