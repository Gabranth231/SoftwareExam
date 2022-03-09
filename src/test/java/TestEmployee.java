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
                "Full-Time",22));
    }
}
