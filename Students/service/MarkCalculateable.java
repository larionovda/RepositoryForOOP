package Students.service;

import Students.entity.Student;

public interface MarkCalculateable {

    double сalcAverMarkStud(Student student);

    void findCountHonors(Student student, Student student2, Student student3, Student student4, Student student5);

    void findCountUnsuccess(Student student, Student student2, Student student3, Student student4, Student student5);

    void calcAverMarkGroup(Student student, Student student2, Student student3, Student student4, Student student5);

}
