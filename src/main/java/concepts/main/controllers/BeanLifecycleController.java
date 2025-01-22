package concepts.main.controllers;


import concepts.main.components.coach.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanLifecycleController {
    //Bean injection place
    private Coach mCoach;

    public BeanLifecycleController(@Qualifier("footballCoach") Coach fCoach){
        this.mCoach = fCoach;
    }

    @GetMapping("/beanlifecycle")
    public String beanlifecycle(){
        return mCoach.workout();
    }

}
