package ro.services;

import ro.domain.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class StudentBuilder {

    private String name;
    private LocalDate birthDate;
    private List<Integer> grade;

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public StudentBuilder setGrade(List<Integer> grade) {
        this.grade = grade;
        return this;
    }

    public Student buildStudent() {
        Period age = calculateAge(birthDate);
        long randomDate = getRandomDate();
        return new Student(name, birthDate, grade, LocalDate.ofEpochDay(randomDate));
    }

    private static Period calculateAge(LocalDate birthDate) {

        return Period.between(birthDate, LocalDate.now());
    }

    private long getRandomDate() {
        long start = LocalDate.of(birthDate.getYear(), 1, 1).toEpochDay();
        long end = LocalDate.of(birthDate.getYear(), 12, 31).toEpochDay();
        return ThreadLocalRandom.current().nextLong(start, end);
    }

}
