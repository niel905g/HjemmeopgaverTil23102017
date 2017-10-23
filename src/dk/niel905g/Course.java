package dk.niel905g;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    // Constructors:
    Course() {} // Default or no arg constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Methods:
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    // Getters;
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

    }
}
