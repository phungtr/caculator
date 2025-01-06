package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    // Khởi tạo đối tượng App
    App app = new App();

    // Kiểm thử phương thức add
    public void testAdd() {
        assertEquals(5, app.add(2, 3));
        assertEquals(0, app.add(-1, 1));
        assertEquals(-5, app.add(-2, -3));
    }

    // Kiểm thử phương thức subtract
    public void testSubtract() {
        assertEquals(1, app.subtract(3, 2));
        assertEquals(0, app.subtract(1, 1));
        assertEquals(-1, app.subtract(-2, -1));
    }

    // Kiểm thử phương thức multiply
    public void testMultiply() {
        assertEquals(6, app.multiply(2, 3));
        assertEquals(-2, app.multiply(-1, 2));
        assertEquals(0, app.multiply(0, 5));
    }

    // Kiểm thử phương thức divide
    public void testDivide() {
        assertEquals(2, app.divide(6, 3));
        assertEquals(-2, app.divide(-6, 3));
        assertEquals(0, app.divide(0, 5));

        // Kiểm thử chia cho 0
        try {
            app.divide(5, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            // Expected exception
        }
    }

    // Tạo bộ kiểm thử
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }
}
