import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LaMevaClasseDeTestXCua {

    Queue<Integer> q;

    @Before
    public void setUp() throws Exception {
        this.q = new LaMevaCua<Integer>(5);

        this.q.push(1);
        this.q.push(2);
        this.q.push(3);

    }

    @Test
    public void testPush1() throws Exception{
        Assert.assertEquals(3,this.q.size());
        this.q.push(4);
        Assert.assertEquals(4,this.q.size());
    }
    @Test
    public void testPush2() throws Exception{
        Assert.assertEquals(3,this.q.size());
        this.q.push(4);
        this.q.push(5);
        Assert.assertEquals(5,this.q.size());
    }

    @Test
    public void testPull1() throws Exception{
        Assert.assertEquals(3,this.q.size());
        Integer a = this.q.pop();
        Assert.assertEquals(2,this.q.size());
    }

    @Test
    public void testPull2() throws Exception{
        Assert.assertEquals(3,this.q.size());
        Integer a = this.q.pop();
        Assert.assertEquals(2,this.q.size());
        Integer b = this.q.pop();
        Assert.assertEquals(1,this.q.size());
    }

}
