package PartE;
import java.util.*;

public final class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private static String priority;

    private final int id;
    private final int smallQuestions;
    private final int bigQuestions;

    private final double gpa;

    public Student(String firstname, String lastname, int id, double gpa, int smallQuestions, int bigQuestions) {
        // initialize
        this.firstName = firstname;
        this.lastName = lastname;
        this.id = id;
        this.gpa = gpa;
        this.smallQuestions = smallQuestions;
        this.bigQuestions = bigQuestions;
    }

    // get the list of priorities
    public static List<String> getPriorities() {
        return Arrays.asList("default", "first-name", "last-name", "student-id",
                "gpa", "number-of-small-questions", "number-of-big-questions", "number-of-small-and-big-questions");
    }

    // set the priority
    public static void setCompareToPriority(String priority) {
        Student.priority = priority;
    }

    // compareTo method for priority config
    @Override
    public int compareTo(Student s) {
        if (priority.equals("first-name")){
            return this.firstName.compareTo(s.firstName);
        }
        if(priority.equals("last-name"))
            return this.lastName.compareTo(s.lastName);

        if(priority.equals("student-id"))
            return Integer.compare(this.id, s.id);

        if(priority.equals("gpa"))
            return Double.compare(this.gpa, s.gpa);

        if(priority.equals("number-of-small-questions"))
            return Integer.compare(this.smallQuestions, s.smallQuestions);

        if(priority.equals("number-of-big-questions"))
            return Integer.compare(this.bigQuestions, s.bigQuestions);

        if(priority.equals("number-of-small-and-big-questions"))
            return Integer.compare(this.smallQuestions + this.bigQuestions, s.smallQuestions + s.bigQuestions);
        // default return
        return 0;
    }

    // to print the variables for student
    @Override
    public String toString() {
        return "\t\t" + firstName + "\t" + lastName + "\t" + id + "\t" + String.format("%.2f", gpa) + "\t" + smallQuestions + "\t" + bigQuestions;
    }
}