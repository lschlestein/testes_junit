package calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalcTest {
    double a;
    double b;
    double res;
    Calc calc;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {

    }

    @BeforeEach
    void setUp() {
        calc = new Calc();
        a = 5;
        b = 2;
        res = 0;
    }

    @AfterEach
    void tearDown() {
        calc = null;
    }

    @Test
    void testAdd() {
        res = calc.add(a, b);
        assertEquals(7, res);
    }

    @Test
    void testSub() {
        res = calc.sub(a, b);
        assertEquals(3, res);
    }

    @Test
    void testMul() {
        res = calc.mul(a, b);
        assertEquals(10, res);
    }

    @Test
    void testDiv() {
        res = calc.div(a, b);
        assertEquals(2.5, res);
    }

    @Test
    void testDivByZero() {
        b = 0;
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.div(a, b));
        String message = exception.getMessage();
        String expected = "Division by zero";
        assertEquals(expected, message);
    }

    @Test
    void testPow() {
        res = calc.pow(a, b);
        assertEquals(25, res);
    }

    @Test
    void testSqrt() {
        a = 4;
        res = calc.sqrt(a);
        assertEquals(2, res);
    }
}