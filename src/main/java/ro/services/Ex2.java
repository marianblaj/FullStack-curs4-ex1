package ro.services;

import ro.domain.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Ex2 {

    public void printStudentsWithAllocatedCourses() {
        for (Student student : StudentServices.studentsList) {
            System.out.println("\n" + student.name() + " will participate to course {\n " + allocateCourse() + "}\n");
        }
    }

    private String allocateCourse() {
        Random rand = new Random();

        List<String> courses = Arrays.asList("matematica", "istorie", "geografie", "sport");
        int randomSemester = ThreadLocalRandom.current().nextInt(1, 3);

        int randomIndex = rand.nextInt(courses.size());
        String randomCourse = courses.get(randomIndex);

        return """                              
                "course" : %s,
                "semester" : %d              
                """.formatted(randomCourse, randomSemester);
    }
}
