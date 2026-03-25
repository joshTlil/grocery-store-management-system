package com.grocery.test;

import com.grocery.service.Checkout;
import org.junit.jupiter.api.Test;

public class CheckoutTest {
    @Test
    public void checkoutThread() throws InterruptedException{
        Checkout lane = new Checkout("Test Lane");
        lane.start();
        lane.join();
    }
}
