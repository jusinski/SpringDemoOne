package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args){
        // load conf file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // get bean from container
        Coach theCoach = context.getBean("sensei", Coach.class);

        // call mehods on bean
        System.out.println(theCoach.getDailyWorkout());

        //new metod fortuneService
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
