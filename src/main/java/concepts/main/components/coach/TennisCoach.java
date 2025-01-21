package concepts.main.components.coach;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String workout(){
        return "Practice your backhand volley.";
    }
}
