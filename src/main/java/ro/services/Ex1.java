package ro.services;

import ro.domain.Student;

import java.util.List;

import static java.util.stream.Collectors.*;

public class Ex1 {

    public void studentsAverageGrade() {

        double result = StudentServices.studentsList.stream()
                .collect(
                        teeing(
                                summingDouble(student -> mediaStudentIndividual(student.grade())),
                                counting(),
                                (sum, count) -> sum / count));
        System.out.println("\n" + StudentServices.studentsList.stream().map(Student::name).collect(toList()) +
                " have an average grade of " + result);

    }

    private double mediaStudentIndividual(List<Integer> notes) {

        return notes.stream()
                .collect(teeing(
                        summingDouble(nota -> nota),
                        counting(),
                        (sum, count) -> sum / count));
    }
}
