package springdemo;

public class MyApp {
    public static void  main(String[] args) {
        //create obcject
        Coach theCoach = new KendoCoach();

        //use object
        System.out.println(theCoach.getDailyWorkout());
    }
}
