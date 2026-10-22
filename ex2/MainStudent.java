package ex2;

public class MainStudent {
    public static boolean isPassed(Student student){
        return student.getGpa() >= 5.0;
    }

    public static void main(String[] args) {
        Student student1 = new Student("An", 7.5);
        Student student2 = new Student("Binh", 4.0);

        if (isPassed(student1)) {
            System.out.println(student1.getName() + " thi do");
        } else {
            System.out.println(student1.getName() + " thi truot");
        }

        if (isPassed(student2)) {
            System.out.println(student2.getName() + " thi do");
        } else {
            System.out.println(student2.getName() + " thi truot");
        }
    }
}
