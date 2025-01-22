package concepts.main.components.coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//default us singleton bean scope
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("In constructor:  " + getClass().getSimpleName() );
    }
    @Override
    public String workout(){
        return "Football coach says hut hit hike!";
    }

    //init methods
    @PostConstruct
    public void startup(){
        System.out.println("In FootballCoach startup():  " + getClass().getSimpleName() );
    }

    @PreDestroy
    public void shutdown(){
        System.out.println("In FootballCoach shutdown():  " + getClass().getSimpleName() );
    }

}
