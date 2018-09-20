package myapp;

import myapp.MyAppController;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MyAppControllerTest {

    private MyAppController underTest;

    @Before
    public void setUp() {
        this.underTest = new MyAppController();
    }

    @Test
    public void testIndex() {
        String index = this.underTest.index();
        assertEquals("index.html", index);
    }
}
