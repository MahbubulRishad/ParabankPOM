package com.parabank.parasoft.test.util;

public class General {
    public static final int PAGE_LOAD_TIME = 30;

    public static void domStable(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
