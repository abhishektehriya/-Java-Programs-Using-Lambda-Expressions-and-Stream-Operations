import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class FilterAndSortStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Abhishek", 82),
                new Student("Piyush", 74),
                new Student("Anuj", 91),
                new Student("Ashwani", 68),
                new Student("Ombeer", 77)
        );

        System.out.println("Students Scoring > 75% (Sorted by Marks):");

        students.stream()
                .filter(s -> s.marks > 75)
                .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
                .map(s -> s.name + " (" + s.marks + "%)")
                .forEach(System.out::println);
    }
}
