package by.itstep.karnei.deadlock;

public class Friend {

    public final String name;

    public Friend(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public synchronized void lockFriend (Friend locker) {
        System.out.format("%s: %s"
                        + "  has locked to me!%n",
                this.name, locker.getName());
        locker.unLockerFriend(this);
    }

    public synchronized void unLockerFriend(Friend locker) {
        System.out.format("%s: %s"
                        + " has unLocked to me!%n",
                this.name, locker.getName());
    }

}
