package ge.test.service;
import ge.test.entity.HelperEntity;
import ge.test.entity.Student;
import java.util.ArrayList;
import java.util.List;

public class Service {


    private List<Student> students = new ArrayList<>();

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    //Consumer
    public static void printAll(Student s) {
        System.out.println(s);
    }


    //Predicate
    public static boolean isAgeGreaterThen18(Student student) {

        if (student.getAge() > 18) {
            return true;
        }
        return false;
    }


    //Function
    public static String calculateGPA(Student s) {

        int totalQuality = (s.getGradeOfBiology() * 3) +
                (s.getGradeOfEnglish() * 4) +
                (s.getGradeOfHistory() * 3);

        int totalCredit = 3 + 4 + 3;

        int GPA = totalQuality / totalCredit;

        return s.getFirstName() + " Your GPA is: " + GPA;

    }

    //mapToInt
    public static int isAverageGradeGreaterThen90(Student s) {

        int averageGrade = ((s.getGradeOfBiology() +
                s.getGradeOfEnglish() +
                s.getGradeOfHistory()) / 3);

        if (averageGrade > 90) {
            return 1;
        }
        return 0;
    }

    //Function
    public static HelperEntity newEntity(Student student){

        return new HelperEntity(student.getFirstName() + " " + student.getLastname() ,student.getAge(),
                student.getGradeOfHistory(), student.getGradeOfBiology(), student.getGradeOfEnglish());
    }

    public List<Student> getStudents() {
        return students;
    }


    public void add(Student st) {

        students.add(st);
    }

}
