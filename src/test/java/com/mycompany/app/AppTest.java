package com.mycompany.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private App app;
    
    @BeforeEach
    public void setUp() {
        app = new App();
    }

    @Test
    public void testAppConstructor() {
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage() {
        assertEquals("Hello World!", app.getMessage());
    }

    @Test
    public void testMessageConsistency() {
        String firstCall = app.getMessage();
        String secondCall = app.getMessage();
        assertEquals(firstCall, secondCall);
    }
}
