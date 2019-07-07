package Students;

public class StudentProgress {

    private int[] marks = new int[4];


    public StudentProgress(int algebra, int history, int english, int biology) {
        marks[0] = algebra;
        marks[1] = history;
        marks[2] = english;
        marks[3] = biology;
    }


    public int[] getMarks() {
        return marks;
    }
}
