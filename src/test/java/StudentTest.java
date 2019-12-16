import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student("Tim", 2012931);
    Student two = new Student("Eric", 444);



    @Test
    public void canGetName(){
        assertNotNull(student.getName());
        assertNotNull(two.getName());
        assertNotEquals("", student.getName());
        assertEquals("Tim", student.getName());
        assertNotEquals("", two.getName());
        assertEquals("Eric", two.getName());
    }

    @Test
    public void canGetId(){
        assertEquals(2012931, student.getId());
        assertEquals(444, two.getId());

    }

    @Test
    public void canAddGrades(){
        student.addGrade(100);
        two.addGrade(50);
        int firstGrade = student.getGrades().get(0);
        int twoGrade = two.getGrades().get(0);
        assertEquals(100, firstGrade);
        assertEquals(50, twoGrade);

    }

    @Test
    public void canGetAverage(){
        assertEquals(0, student.getGradeAverage(), 0);
        student.addGrade(100);
        student.addGrade(50);
        student.addGrade(0);
        two.addGrade(20);
        two.addGrade(40);
        two.addGrade(60);
        two.addGrade(80);
        two.addGrade(100);
        assertEquals(50, student.getGradeAverage(), 0);
        assertEquals(60, two.getGradeAverage(), 0);

    }
}
