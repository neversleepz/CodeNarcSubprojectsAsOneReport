package io;

import java.math.BigDecimal

/**
 * User: kon
 * Date: 15/09/2014
 * Time: 5:08 PM
 */
public class HelloWorld {
    int myMethod(int count) {
        try {
            doSomething()
        } finally {
            assert count > 0        // violation
        }
    }
}
