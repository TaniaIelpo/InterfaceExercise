package it.develhope.exerciseinterface;

/**
 * This class represents an Assistant
 *
 * @Tania Ielpo
 */

public class Assistant extends CollegePerson implements LearningPerson,TeachingPerson{

    boolean isGoingToBeAPhD;

    public Assistant (String name, String surname, int id, boolean willBeAPhD){
        super(name, surname, id);
        this.isGoingToBeAPhD=willBeAPhD;
    }

    /*@Override
    //override super class method with additional information
    public void goToCollege() {
        System.out.println("ASSISTANT");
        super.goToCollege();
    }*/


    //override interfaces abstract methods
    @Override
    public void studyAtHome() {
        System.out.println("This ASSISTANT ("+this.name+ " "+this.surname+
                ") studies at home. He/She will be APhd? "+this.isGoingToBeAPhD);
    }

    @Override
    public void teachToOtherPeople() {
        System.out.println("This ASSISTANT ("+this.name+ " "+this.surname+
                ") teaches to other people. He/She will be APhd? "+this.isGoingToBeAPhD);
    }
}
