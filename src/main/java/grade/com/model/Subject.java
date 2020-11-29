package grade.com.model;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    private String name;
    private List<Double> notes = new LinkedList<Double>();

    public Subject(String name) {
        //Your code here.....
        this.name = name;
    }

    public String getName() {
        //Your code here.....
        return name;
    }

    public void addNote(double note) {
        //Your code here.....
    }

    public List<Double> getNotes() {
        //Your code here.....
        return null;
    }

    public double getAverage() {
        //Your code here.....
        return 0;
    }
}
