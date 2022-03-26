package it.develhope.exerciseinterface;

/**
 * This class represent a College Person
 *
 * @author Tania Ielpo
 */

public class CollegePerson {

    public String name;
    public String surname;
    public int collegeId;


    public CollegePerson(String name, String surname, int id){
        this.name=name;
        this.surname=surname;
        this.collegeId=id;
    }

    public void goToCollege(){
        System.out.println("Name: "+this.name+ ", Surname: "+this.surname+", CollegeID: "+this.collegeId);
    }
}
