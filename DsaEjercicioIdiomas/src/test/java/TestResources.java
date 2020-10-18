import org.junit.Assert;
import org.junit.Test;

public class TestResources {
    @Test
    public void testGood() throws Exception {
        Assert.assertEquals("hola", Idiomas.getInstance("ca").getText("ca", "l1"));
        Assert.assertEquals("hola", Idiomas.getInstance("es").getText("es", "l1"));
        Assert.assertEquals("hello", Idiomas.getInstance("en").getText("en", "l1"));
        Assert.assertEquals("adeu", Idiomas.getInstance("ca").getText("ca", "l2"));
        Assert.assertEquals("adios", Idiomas.getInstance("es").getText("es", "l2"));
        Assert.assertEquals("bye", Idiomas.getInstance("en").getText("en", "l2"));

    }
}
