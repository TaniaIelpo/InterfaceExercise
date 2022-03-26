package it.develhope.exerciseinterface;

/**
 * This class represents  a Student
 *
 * @author
 */

public class Student extends CollegePerson implements LearningPerson{

    int academicYear;

    public Student(String name, String surname, int id, int year){
        super(name, surname, id);
        this.academicYear=year;
    }

    /*@Override
    //override super class method with additional information
    public void goToCollege() {
        System.out.println("STUDENT");
        super.goToCollege();
    }*/

    //override interface abstract method

    @Override
    public void studyAtHome() {
        System.out.println("This STUDENT ("+this.name+" "+this.surname+
                ") studies at home. Academic year: "+this.academicYear);
    }

}
