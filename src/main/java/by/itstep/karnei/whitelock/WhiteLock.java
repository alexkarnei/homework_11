package by.itstep.karnei.whitelock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WhiteLock {

    public static void main(String[] args) {
        final Friend aleksandr =
                new Friend("Aleksandr");
        final Friend roman =
                new Friend("Roman");
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new LockLoop(aleksandr, roman));
        executorService.execute(new LockLoop(roman, aleksandr));
    }
}
