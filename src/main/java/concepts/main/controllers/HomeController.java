package concepts.main.controllers;

import concepts.main.components.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private Coach mCoach;

    //Constructor Injection
    @Autowired
    public HomeController( @Qualifier("cricketCoach") Coach injectedCoach){
        mCoach = injectedCoach;
    }

    @Value("${home.welcome}")
    private String welcomeMessage;


    @GetMapping("/")
    public String index(){
        return welcomeMessage;
    }

    @GetMapping("/workout")
    public String workout() {
        return this.mCoach.workout();
    }

    /* Qualifier Testing. Bean selection below is the most important */
//    @GetMapping("/tennisWorkout")
//    @Autowired
//    public String tennisWorkout(@Qualifier("tennisCoach") Coach injectedCoach){ //@Qualifier("tennisCoach") Coach injectedCoach
//        //mCoach = injectedCoach;
//        return "TEST";
//    }

/*



    //Setter Injection
    @Autowired
    //Setter Injection
    public void setCoach(Coach injectedCoach){
        mCoach = injectedCoach;
    }

    //Any Method Can Inject
    @Autowired
    public void mMethod(Coach injectedCoach){
        mCoach = injectedCoach;
    }





    @GetMapping("/workout")
    public String workout() {
        return this.mCoach.workout();
    }

 */
}
