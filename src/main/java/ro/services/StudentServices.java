package ro.services;

import ro.domain.Student;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class StudentServices {

    public static List<Student> studentsList = new ArrayList<Student>();

    public void addStudents() {
        for (int i = 0; i < 10; i++) {
            studentsList.add(i, new StudentBuilder()
                    .setName("name" + i)
                    .setBirthDate(LocalDate.of(1985, 8, 13))
                    .setGrade(generate7grades())
                    .buildStudent());
        }
    }

    private List<Integer> generate7grades() {
        List<Integer> generatedGrades = new ArrayList<Integer>();
        for (int i = 0; i < 7; i++) {
            generatedGrades.add(ThreadLocalRandom.current().nextInt(5, 10));
        }
        return generatedGrades;
    }

}
