package it.develhope.exerciseinterface;

/**
 * This class represent a Professor
 *
 * @author Tania Ielpo
 */

public class Professor extends CollegePerson implements TeachingPerson{

    public String teachingSubject;

    public Professor(String name, String surname, int id, String subject){
        super(name, surname, id);
        this.teachingSubject=subject;
    }

    /*@Override
    //override super class method with additional information
    public void goToCollege() {
        System.out.println("PROFESSOR");
        super.goToCollege();
    }*/


    //override interface abstract method
    @Override
    public void teachToOtherPeople() {
        System.out.println("This PROFESSOR ("+this.name+ " "+this.surname+") teaches "+this.teachingSubject+" to other people");
    }
}
