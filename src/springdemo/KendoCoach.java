package springdemo;

public class KendoCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define the constructor for dependency injection
    public KendoCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public KendoCoach(){
        
    }

    @Override
    public String getDailyWorkout() {
        return "Do 300 MEN hits";
    }

    @Override
    public String getDailyFortune() {
        // use fortuneService to get one
        return fortuneService.getFortune();
    }
}