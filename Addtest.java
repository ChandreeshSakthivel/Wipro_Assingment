import org.junit.*;
public class Addtest{
    @Test
    public void add(){
        int res=2+3;
        Assert.assertEquals(5, res);
    }
}