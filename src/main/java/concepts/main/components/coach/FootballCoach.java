package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String workout(){
        System.out.println("In constructor:  " + getClass().getSimpleName() );
        return "Football coach says hut hit hike!";
    }
}
