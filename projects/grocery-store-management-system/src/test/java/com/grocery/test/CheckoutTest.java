package com.grocery.test;

import com.grocery.service.Checkout;
import org.junit.Test;

public class CheckoutTest {
    @Test
    public void checkoutThread() throws InterruptedException{
        Checkout lane = new Checkout("Test Lane");
        lane.start();
        lane.join();
    }
}
