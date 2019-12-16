import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student("Jeff", 2012931);



    @Test
    public void canGetName(){
        assertNotNull(student.getName());
        assertNotEquals("", student.getName());
        assertEquals("Jeff", student.getName());
    }

    @Test
    public void canGetId(){
        assertEquals(2012931, student.getId());
    }

    @Test
    public void canAddGrades(){
        student.addGrade(100);
        int firstGrade = student.getGrades().get(0);
        assertEquals(100, firstGrade);
    }

    @Test
    public void canGetAverage(){
        assertEquals(0, student.getGradeAverage(), 0);
        student.addGrade(100);
        student.addGrade(50);
        student.addGrade(0);
        assertEquals(50, student.getGradeAverage(), 0);
    }
}
