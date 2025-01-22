package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String workout(){
        System.out.println("In constructor:  " + getClass().getSimpleName() );
        return "Tennis coach says practice your backhand volley.";
    }
}
