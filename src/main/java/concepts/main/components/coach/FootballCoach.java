package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("In constructor:  " + getClass().getSimpleName() );
    }
    @Override
    public String workout(){

        return "Football coach says hut hit hike!";
    }
}
