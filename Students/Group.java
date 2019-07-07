package Students;

public class Group {

    private Student[] students = new Student[5];


    public Group(Student student, Student student2, Student student3, Student student4, Student student5) {
        this.students[0] = student;
        this.students[1] = student2;
        this.students[2] = student3;
        this.students[3] = student4;
        this.students[4] = student5;
    }


    public Student[] getStudents() {
        return students;
    }
}
