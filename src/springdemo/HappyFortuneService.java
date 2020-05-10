package springdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Things are getting better!";
    }
}
