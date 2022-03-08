import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition() {
        Calculator mycalc = new Calculator();
        int sum = mycalc.addition();
        assertEquals(sum, 8);
    }

    @Test
    void subtraction() {
        Calculator mycalc1 = new Calculator();
        int sum = mycalc1.subtraction(5,1);
        assertEquals(sum, 4);
    }

    @Test
    void multiply() {
        Calculator mycalc2 = new Calculator();
        int sum = mycalc2.multiply(3,9);
        assertEquals(sum, 27);

    }

    @Test
    void divide() {
        Calculator mycalc3 = new Calculator();
        int sum = mycalc3.divide(8, 4);
        assertEquals(sum, 2);
    }

    @Test
    void squareroot() {
        Calculator mycalc4 = new Calculator();
        double sum = mycalc4.squareroot(4);
        assertEquals(sum, 2);
    }
}