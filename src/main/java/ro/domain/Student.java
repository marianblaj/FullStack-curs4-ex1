package ro.domain;

import java.time.LocalDate;
import java.util.List;

public record Student(String name, LocalDate birthDate, List<Integer> grade, LocalDate randomlyDate) {


    public Student(String name, LocalDate birthDate, List<Integer> grade, LocalDate randomlyDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.grade = grade;
        this.randomlyDate = randomlyDate;
    }

}
