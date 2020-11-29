package grade.com.test;

import grade.com.main.GradeBook;
import grade.com.model.Subject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void shouldntAllowToAddSubjectThatAlreadyExists() {
        //Your code here.....
        assertThrows(IllegalArgumentException.class, () -> gradeBookWithSubject.addSubject(SUBJECT));
    }

    @Test
    void shouldGetValidSubjectFromGradeBook() {
        //Your code here.....
        Subject subject = gradeBookWithSubject.getSubject(SUBJECT);
        assertEquals(SUBJECT, subject.getName());
    }

    @Test
    void shouldntAllowToGetNonExistingSubject() {
        //Your code here.....
        GradeBook gradeBook = GradeBook.getInstance();
        assertThrows(IllegalArgumentException.class, () -> gradeBook.getSubject(OTHER_SUBJECT));
    }

    @Test
    void shouldBeAbleToAddNote() {
        //Your code here.....
        gradeBookWithSubject.addNote(SUBJECT, 4.5);
        assertEquals(true, gradeBookWithSubject.getSubject(SUBJECT).getNotes().contains(new Double(4.5)));
    }

    @Test
    void shouldntAllowToAddANoteToNonExistingSubject() {
        //Your code here.....
        GradeBook gradeBook = GradeBook.getInstance();
        assertThrows(IllegalArgumentException.class, () -> gradeBook.addNote(OTHER_SUBJECT, 4.5));
    }

    @Test
    void shouldComputeGlobalAverageNote()  {
        //Your code here.....
        gradeBookWithSubject.addSubject(OTHER_SUBJECT);
        gradeBookWithSubject.addNote(SUBJECT, 3);
        gradeBookWithSubject.addNote(SUBJECT, 5);
        gradeBookWithSubject.addNote(OTHER_SUBJECT, 2);
        gradeBookWithSubject.addNote(OTHER_SUBJECT, 4);

        assertEquals(3.5, gradeBookWithSubject.getAverageNote(), 0.001);
    }
}
