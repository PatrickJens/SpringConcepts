package concepts.main.controllers;

import concepts.main.components.coach.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private Coach mCoach;

    //Constructor Injection
    @Autowired
    public HomeController(Coach injectedCoach){
        mCoach = injectedCoach;
    }

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
}
