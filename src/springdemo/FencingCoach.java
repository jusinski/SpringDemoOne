package springdemo;

public class FencingCoach implements Coach{

    private FortuneService fortuneService;

    public FencingCoach() {

    }

    //add new fields for email and team
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice sword strikes for 30 min";
    }

    @Override
    public String getDailyFortune(){
        return fortuneService.getFortune();
    }
}
