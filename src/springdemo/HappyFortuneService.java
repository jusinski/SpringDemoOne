package springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

    public String[] fortunes = {"Things are getting better every day!", "Do the Plan step by step!", "Everything is difficulty only at beginning!"};
    Random r = new Random();
    int randomNumber = r.nextInt(fortunes.length);

    @Override
    public String getFortune() {
        return fortunes[randomNumber];
    }
}
