package springdemo;

public class SnowboardCoach implements Coach{
    public SnowboardCoach() {
    }

    private FortuneService fortuneService;

    public SnowboardCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Waiting for snow...";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
