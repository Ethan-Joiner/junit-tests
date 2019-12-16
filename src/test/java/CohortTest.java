import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
public class CohortTest {

    Cohort empty;
    Cohort hasStudent;
    Cohort hasStudents;

    @Before
    public void setup(){
        Student one = new Student(123, "Tim");
        Student two = new Student(321, "Eric");
        Student three = new Student(234, "Casey");

        empty = new Cohort();

        hasStudent = new Cohort();
        hasStudent.addStudent(one);

        hasStudents = new Cohort();
        hasStudents.addStudent(one);
        hasStudents.addStudent(two);
        hasStudents.addStudent(three);
    }
    @Test
    public void testIfHasStudents(){
        assertTrue(empty.getStudents().size() == 0);
        assertFalse(hasStudent.getStudents().size() == 0);

    }

    @Test
    public void testIfCanAddStudents(){
        assertEquals(0, empty.getStudents().size());
        assertEquals(1, hasStudent.getStudents().size());
        assertEquals(3, hasStudents.getStudents().size());
    }

    @Test
    public void testIfCanGetStudents(){
        assertEquals("Tim", hasStudent.getStudents().get(0).getName());
        assertEquals("Tim", hasStudents.getStudents().get(0).getName());
        assertEquals("Eric", hasStudents.getStudents().get(1).getName());
        assertEquals("Casey", hasStudents.getStudents().get(2).getName());


    }
}
