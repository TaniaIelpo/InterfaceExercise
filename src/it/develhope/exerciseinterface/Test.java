package it.develhope.exerciseinterface;

/**
 * This class represents a Test
 */

public class Test {

    public static void main(String[] args) {
        // declaration and assignment
        Professor prof=new Professor("Mario","Rossi", 12345, "IUM");
        Student student = new Student ("Tania", "Ielpo", 678910, 2018);
        Assistant assistant=new Assistant("Emanuela","Bianchi", 45678, true);

        //invoke super class method
        prof.goToCollege();
        student.goToCollege();
        assistant.goToCollege();

        System.out.println("----------------------------");

        //invoke abstract methods from interfaces
        prof.teachToOtherPeople();
        student.studyAtHome();
        assistant.teachToOtherPeople();
        assistant.studyAtHome();
    }
}
