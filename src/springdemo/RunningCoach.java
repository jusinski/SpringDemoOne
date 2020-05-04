package springdemo;

public class RunningCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 10 km";
    }
}
