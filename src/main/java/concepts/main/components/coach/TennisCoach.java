package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println("In constructor:  " + getClass().getSimpleName() );
    }
    @Override
    public String workout(){

        return "Tennis coach says practice your backhand volley.";
    }
}
