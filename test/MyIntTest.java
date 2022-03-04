import org.junit.Assert;
import org.junit.Test;

public class MyIntTest {
    MyInt x = new MyInt("-2147483649");
    MyInt y = new MyInt("2147483648");

    @Test
    public void testVariables()throws Exception {
        MyInt result = new MyInt(123);
        Assert.assertEquals("123", result.toString());
        result = new MyInt(-123);
        Assert.assertEquals("-123", result.toString());
        result = new MyInt(new byte[]{1, 1, 2, 3});
        Assert.assertEquals("-123", result.toString());
        result = new MyInt(new byte[]{0, 1, 2, 3});
        Assert.assertEquals("123", result.toString());
        result = new MyInt("123");
        Assert.assertEquals("123", result.toString());
        result = new MyInt("-123");
        Assert.assertEquals("-123", result.toString());
    }
    @Test
    public void testAdd() throws Exception {
        MyInt result = x.add(y);
        Assert.assertEquals("-1", result.toString());
    }

    @Test
    public void testSubtract() throws Exception {
        MyInt result = x.subtract(y);
        Assert.assertEquals("-4294967297", result.toString());
    }

    @Test
    public void testMultiply() throws Exception {
        MyInt result = x.multiply(y);
        Assert.assertEquals("-4611686020574871552", result.toString());
    }

    @Test (expected = ArithmeticException.class)
    public void testDivide() throws Exception {
        MyInt result = x.divide(y);
        Assert.assertEquals("-1", result.toString());
        result = x.divide(new MyInt("0"));
    }

    @Test
    public void testMax() throws Exception {
        MyInt result = x.max(y);
        Assert.assertEquals("2147483648", result.toString());
    }

    @Test
    public void testMin() throws Exception {
        MyInt result = x.min(y);
        Assert.assertEquals("-2147483649", result.toString());
    }

    @Test
    public void testAbs() throws Exception {
        MyInt result = x.abs();
        Assert.assertEquals("2147483649", result.toString());
        result = y.abs();
        Assert.assertEquals("2147483648", result.toString());
    }

    @Test
    public void testCompareTo() throws Exception {
        int result = x.compareTo(y);
        Assert.assertEquals(-1, result);
        result = x.compareTo(x);
        Assert.assertEquals(0, result);
        result = y.compareTo(x);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGcd() throws Exception {
        MyInt result = x.gcd(y);
        Assert.assertEquals("1", result.toString());
    }

    @Test
    public void testToString() throws Exception {
        String result = x.toString();
        Assert.assertEquals("-2147483649", result);
        result = y.toString();
        Assert.assertEquals("2147483648", result);
    }

    @Test
    public void testLongValue() throws Exception {
        long result = x.longValue();
        Assert.assertEquals(-2147483649L, result);
        result = y.longValue();
        Assert.assertEquals(2147483648L, result);
    }
}
