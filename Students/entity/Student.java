package Students.entity;

import Students.repository.StudentProgress;

public class Student {

    private String firstName;
    private String lastName;
    private StudentProgress studProg;


    public Student(String firstName, String lastName, int algebra, int history, int english, int biology) {
        this.studProg = new StudentProgress(algebra, history, english, biology);
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName;
    }


    public StudentProgress getStudProg() {
        return studProg;
    }
}
