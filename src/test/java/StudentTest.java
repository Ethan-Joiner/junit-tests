import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student("Jeff", 2012931);


    @Test
    public void hasName(){
        assertEquals("Jeff", student.getName());
    }

    @Test
    public void hasId(){
        assertEquals(2012931, student.getId());
    }
}
