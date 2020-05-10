package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        // load conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from container
        Coach theKendoCoach = context.getBean("sensei", Coach.class);
        Coach theSnowCoach = context.getBean("snowCoach", Coach.class);

        // call method on bean
        System.out.println(theKendoCoach.getDailyWorkout());

        // new method fortuneService
        System.out.println(theKendoCoach.getDailyFortune());

        // new coach method on bean and fortune method
        System.out.println("");
        System.out.println(theSnowCoach.getDailyWorkout());
        System.out.println(theSnowCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
