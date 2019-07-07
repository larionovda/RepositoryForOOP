package Students;

public class Demo {
    public void run() {

        Student student = new Student("Dmitriy", "larionov", 5, 5, 5, 5);
        Student student2 = new Student("Roman", "Pavlov", 5, 3, 5, 5);
        Student student3 = new Student("Greg", "Cambell", 5, 5, 5, 5);
        Student student4 = new Student("John", "Koul", 5, 3, 4, 5);
        Student student5 = new Student("David", "laid", 2, 5, 4, 5);
        MarkCalculationService markCalc = new MarkCalculationService();
        System.out.println(markCalc.сalcAverMarkStud(student));
        System.out.println(markCalc.сalcAverMarkStud(student2));
        System.out.println(markCalc.сalcAverMarkStud(student3));
        System.out.println(markCalc.сalcAverMarkStud(student4));
        System.out.println(markCalc.сalcAverMarkStud(student5));
        markCalc.calcAverMarkGroup(student, student2, student3, student4, student5);
        markCalc.findCountUnsuccess(student, student2, student3, student4, student5);
        markCalc.findCountHonors(student, student2, student3, student4, student5);

    }
}
