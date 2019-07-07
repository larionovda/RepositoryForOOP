package Students;

public class MarkCalculationService implements MarkCalculateable {

    private final int MAXMARK = 5;
    private final int MINMARK = 2;
    private int countStudents;


    @Override
    public double сalcAverMarkStud(Student student) {
        double countMarks = 0;
        for (int i = 0; i < student.getStudProg().getMarks().length; i++) {
            countMarks += student.getStudProg().getMarks()[i];
        }
        return countMarks / student.getStudProg().getMarks().length;
    }


    @Override
    public void findCountHonors(Student student, Student student2, Student student3, Student student4, Student student5) {
        Group group = new Group(student, student2, student3, student4, student5);
        for (int i = 0; i < group.getStudents().length; i++) {
            int temp = 0;
            for (int j = 0; j < group.getStudents()[i].getStudProg().getMarks().length; j++) {
                if (group.getStudents()[i].getStudProg().getMarks()[j] == MAXMARK) {
                    temp++;
                    if (temp == group.getStudents()[i].getStudProg().getMarks().length) {
                        countStudents++;
                    }
                }
            }
        }
        System.out.println("number of honors is " + countStudents);
        countStudents = 0;
    }


    @Override
    public void findCountUnsuccess(Student student, Student student2, Student student3, Student student4, Student student5) {
        Group group = new Group(student, student2, student3, student4, student5);
        for (int i = 0; i < group.getStudents().length; i++) {
            for (int j = 0; j < group.getStudents()[i].getStudProg().getMarks().length; j++) {
                if (group.getStudents()[i].getStudProg().getMarks()[j] <= MINMARK) {
                    countStudents++;
                    break;
                }
            }
        }
        System.out.println("number of unsuccessful is " + countStudents);
        countStudents = 0;
    }

    @Override
    public void calcAverMarkGroup(Student student, Student student2, Student student3, Student student4, Student student5) {
        Group group = new Group(student, student2, student3, student4, student5);
        double count = 0;
        for (int i = 0; i < group.getStudents().length; i++) {
            count += сalcAverMarkStud(group.getStudents()[i]);
        }
        System.out.println("average score of the whole group is "
                + count / (group.getStudents().length));
    }
}


