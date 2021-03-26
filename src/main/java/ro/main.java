package ro;

import ro.services.*;

public class main {
    public static void main(String[] args) {

        StudentServices studentServices = new StudentServices();
        studentServices.addStudents();

        Ex1 ex1 = new Ex1();
        ex1.studentsAverageGrade();

        Ex2 ex2= new Ex2();
        ex2.printStudentsWithAllocatedCourses();

        Ex3 ex3 = new Ex3();
        System.out.println(ex3.switchExpression("choice1"));
        System.out.println(ex3.switchExpression("choice2"));
        System.out.println(ex3.switchExpression("choice3"));

    }

}
