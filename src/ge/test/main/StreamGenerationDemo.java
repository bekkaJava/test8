package ge.test.main;

import ge.test.entity.HelperEntity;
import ge.test.entity.Student;
import ge.test.service.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamGenerationDemo {

    public static void main(String[] args) {


        List<Student> students = Arrays.asList(new Student("John", "Brown", 21),
                new Student("Will", "Smith", 48, 100, 100, 90),
                new Student("Jim", "Carry", 78, 90, 90, 91),
                new Student("Maria", "Jones", 17, 12, 90, 88),
                new Student("Ann", "White", 18, 89, 100, 90),
                new Student("Tom", "Cruise", 52, 12, 10, 30),
                new Student("Jon", "Black", 20, 133, 12, 133),
                new Student("Scarlet", "White", 25, 100, 90, 90),
                new Student("Amanda", "Anderson", 24, 12, 12, 12)


        );


        List<Student> collect1 = students.stream()
                .filter(Service::isAgeGreaterThen18)
                .collect(Collectors.toList());



        List<String> collect = students.stream()
                .map(Service::calculateGPA)
                .collect(Collectors.toList());


        long count1 = students.stream()
                .mapToInt(Service::isAverageGradeGreaterThen90)
                .sum();


        List<HelperEntity> helperEntities = students.stream()
                .map(Service::newEntity)
                .collect(Collectors.toList());



    }


}
