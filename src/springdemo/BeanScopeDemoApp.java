package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){

        // load conf file XML
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from container
        Coach theCoach = context.getBean("mySensei", Coach.class);

        Coach anotherCoach = context.getBean("mySensei", Coach.class);

        // check if they are the same
        boolean result = (theCoach == anotherCoach);

        // print out
        System.out.println("\nPointing to the same object " + result);
        System.out.println("\nMemory location for theCoach " + theCoach);
        System.out.println("\nMemory location for anotherCoach " + anotherCoach);

        //close
        context.close();

    }
}
