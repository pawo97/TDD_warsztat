package grade.com.test;

import grade.com.main.GradeBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.jupiter.api.Assertions.*;

public class GradeBookTest {

    //Your code here.....
    private static final String SUBJECT = "matematyka";
    private static final String OTHER_SUBJECT = "fizyka";

    //Your code here.....
    private GradeBook gradeBookWithSubject;

    @BeforeEach
    void setUp() {
        //Your code here.....
        gradeBookWithSubject = GradeBook.getInstance();
        gradeBookWithSubject.addSubject(SUBJECT);
    }

    @Test
    void shouldBeAbleToCreateGradeBook() {
        //Your code here.....
        GradeBook gradeBook = GradeBook.getInstance();
        assertNotNull(gradeBook);
    }

//    @Test
//    void shouldntAllowToAddSubjectThatAlreadyExists() {
//        //Your code here.....
//    }
//
//    @Test
//    void shouldGetValidSubjectFromGradeBook() {
//        //Your code here.....
//    }
//
//    @Test
//    void shouldntAllowToGetNonExistingSubject() {
//        //Your code here.....
//    }
//
//    @Test
//    void shouldBeAbleToAddNote() {
//        //Your code here.....
//    }
//
//    @Test
//    void shouldntAllowToAddANoteToNonExistingSubject() {
//        //Your code here.....
//    }
//
//    @Test
//    void shouldComputeGlobalAverageNote()  {
//        //Your code here.....
//    }
}
