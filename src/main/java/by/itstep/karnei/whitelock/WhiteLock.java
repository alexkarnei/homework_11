package by.itstep.karnei.whitelock;

import by.itstep.karnei.FirstObject;
import by.itstep.karnei.SecondObject;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WhiteLock {

    FirstObject firstObject = new FirstObject();
    SecondObject secondObject = new SecondObject();
    ExecutorService executorService;

    private WhiteLock() {
        executorService = Executors.newFixedThreadPool(2);
    }

    public static void main(String[] args) {
        new WhiteLock();

    }
}
