package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String workout(){
        System.out.println("In constructor:  " + getClass().getSimpleName() );
        return "Cricket Coach says swing the  cricket bat 15 times!";

    }
}
