package grade.com.main;

import grade.com.model.Subject;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Subject> subjects = new HashMap<String, Subject>();

    private static GradeBook instance = new GradeBook();

    private GradeBook(){}

    public static GradeBook getInstance() {
        //Your code here.....
        return instance;
    }

    public void addSubject(String subject) {
        //Your code here.....
    }

    public Subject getSubject(String subject) {
        //Your code here.....
        return null;
    }

    public void addNote(String subjectName, double note) {
        //Your code here.....
    }

    public double getAverageNote() {
        //Your code here.....
        return 0;
    }
}
