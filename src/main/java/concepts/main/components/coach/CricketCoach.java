package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In constructor:  " + getClass().getSimpleName() );
    }
    @Override
    public String workout(){

        return "Cricket Coach says swing the  cricket bat 15 times!";

    }
}
