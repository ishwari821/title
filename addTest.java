
import org.junit.*;
public class addTest {
    @Test 
    public void test1foradd(){
        add add_var = new add();
        Assert.assertEquals(7,add_var.addNo(3, 4));
        Assert.assertEquals(-7,add_var.addNo(-3, -4));
        Assert.assertEquals(201,add_var.addNo(201, 0));


    }
}
