package by.itstep.karnei.whitelock;

public class WhiteLock {

        public static void main(String[] args) {
            final Friend aleksandr =
                    new Friend("Aleksandr");
            final Friend roman =
                    new Friend("Roman");
            new Thread(new LockLoop(aleksandr, roman)).start();
            new Thread(new LockLoop(roman, aleksandr)).start();
        }
    }
