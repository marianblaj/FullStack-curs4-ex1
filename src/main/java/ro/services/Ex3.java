package ro.services;

import java.util.stream.Collectors;

public class Ex3 {

    public String switchExpression(String choice) {

        return switch (choice) {

            case "choice1" -> {
                System.out.println("\nFor the first 3 students 1st grades are:\n");
                yield StudentServices.studentsList.stream()
                        .limit(3)
                        .map(student1 -> student1.grade().stream().findFirst().orElse(0))
                        .collect(Collectors.toList()).toString();
            }

            case "choice2" -> {
                System.out.println("\nFor the 4th student 5th grade is: \n");
                yield StudentServices.studentsList.stream()
                        .skip(3)
                        .findFirst().orElseThrow().grade().stream().skip(4)
                        .findFirst().orElse(0).toString();
            }

            case "choice3" -> {
                System.out.println("\nFor rest of them 7th grade: \n");
                yield StudentServices.studentsList.stream()
                        .skip(5)
                        .map(student1 -> student1.grade().stream().skip(6).findFirst().orElse(0))
                        .collect(Collectors.toList()).toString();
            }
            default -> "Please select a valid choice";
        };
    }
}
