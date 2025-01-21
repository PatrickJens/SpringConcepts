package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String workout(){
        return "Hut hit hike!";
    }
}
