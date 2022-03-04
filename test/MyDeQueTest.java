import org.junit.Assert;
import org.junit.Test;

public class MyDeQueTest {
    MyDeQue<String> myDeQue = new MyDeQue<>();

    @Test
    public void testPushBack() throws Exception {
        addElements();
        myDeQue.pushBack("y");
        Assert.assertEquals("[a, m, z, y]", myDeQue.toString());
        cleanDeque();
    }

    @Test
    public void testPushFront() throws Exception {
        addElements();
        myDeQue.pushFront("0");
        Assert.assertEquals("[0, a, m, z]", myDeQue.toString());
        cleanDeque();
    }

    @Test
    public void testPopBack() throws Exception {
        addElements();
        String result = myDeQue.popBack();
        Assert.assertEquals("z", result);
        Assert.assertEquals("[a, m]", myDeQue.toString());
        cleanDeque();
        result = myDeQue.popBack();
        Assert.assertNull(result);
    }

    @Test
    public void testPopFront() throws Exception {
        addElements();
        String result = myDeQue.popFront();
        Assert.assertEquals("a", result);
        Assert.assertEquals("[m, z]", myDeQue.toString());
        cleanDeque();
        result = myDeQue.popFront();
        Assert.assertNull(result);
    }

    @Test
    public void testBack() throws Exception {
        addElements();
        String result = myDeQue.back();
        Assert.assertEquals("z", result);
        Assert.assertEquals("[a, m, z]", myDeQue.toString());
        cleanDeque();
        result = myDeQue.back();
        Assert.assertNull(result);
    }

    @Test
    public void testFront() throws Exception {
        addElements();
        String result = myDeQue.front();
        Assert.assertEquals("a", result);
        Assert.assertEquals("[a, m, z]", myDeQue.toString());
        cleanDeque();
        result = myDeQue.front();
        Assert.assertNull(result);
    }

    @Test
    public void testSize() throws Exception {
        addElements();
        int result = myDeQue.size();
        Assert.assertEquals(3, result);
        cleanDeque();
    }

    @Test
    public void testClear() throws Exception {
        addElements();
        myDeQue.clear();
        Assert.assertEquals(0, myDeQue.size());
    }

    @Test
    public void testToArray() throws Exception {
        addElements();
        Object[] result = myDeQue.toArray();
        Assert.assertArrayEquals(new Object[]{"a","m","z"}, result);
        cleanDeque();
        result = myDeQue.toArray();
        Assert.assertEquals(0, myDeQue.size());
    }


    void addElements(){
        myDeQue.pushBack("a");
        myDeQue.pushBack("m");
        myDeQue.pushBack("z");
    }
    void cleanDeque(){
        myDeQue.clear();
    }
}
