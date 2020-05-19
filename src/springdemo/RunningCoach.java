package springdemo;

public class RunningCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;
    public RunningCoach(){

    }

    public RunningCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 10 km";
    }

    @Override
    public String getDailyFortune() {
        // use fortuneService to get one
        return fortuneService.getFortune();
    }

    // add an init method
    public void doMyStuff() {
        System.out.println("RunningCoach: inside method doMyStuff");
    }

    // add a destroy method
    public void removeMyStuff(){
        System.out.println("RunningCoach: inside method removeMyStuff");
    }

}
