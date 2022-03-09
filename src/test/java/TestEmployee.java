import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestEmployee {
    @Test
    public void TestTitle(){
        Employee e1 = new Employee("Mr","Martin","265986","5689741",
                "Full-Time",22);
        assertEquals("Mr",e1.getTitle());
    }
    @Test
    public void TestTitleFail(){
        assertThrows(IllegalArgumentException.class,() -> new Employee("Title","Martin"
                ,"265986","5689741",
                "Full-Time",22),"Wrong Title");
    }
    @Test
    public void TestName(){
        Employee e1 = new Employee("Mr","Martin","265986","5689741",
                "Full-Time",22);
        assertTrue(e1.getName() != null);
    }
    @Test
    public void TestNameFail(){
        assertThrows(IllegalArgumentException.class,() -> new Employee("Mr","Tim","265986","5689741",
                "Full-Time",22),"Name is Invalid");
    }
    @Test
    public void TestPPSID(){
        Employee e1 = new Employee("Mr","Martin","265986","5689741",
                "Full-Time",22);
        assertTrue(e1.getPPSID() != null);
    }
    @Test
    public void TestPPSIDFail(){
        assertThrows(IllegalArgumentException.class,()-> new Employee("Mr","Martin","3","5689741",
                "Full-Time",22),"PPSID is Invalid");
    }
    @Test
    public void TestPhone(){
        Employee e1 = new Employee("Mr","Martin","265986","5689741",
                "Full-Time",22);
        assertTrue(e1.getPhone() != null);
    }
    @Test
    public void TestPhoneFail(){
        assertThrows(IllegalArgumentException.class,()-> new Employee("Mr","Martin","265986","23",
                "Full-Time",22),"Phone is Invalid");
    }
}
