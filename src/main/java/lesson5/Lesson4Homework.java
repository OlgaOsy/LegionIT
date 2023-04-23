package lesson5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lesson4Homework {
    public static void main(String[] args) {
        Lesson4Homework lesson4Homework = new Lesson4Homework();
        System.out.println(lesson4Homework.getDay(6));
        //System.out.println(lesson4Homework.toyStore(45));
       lesson4Homework.arrayListNames();
    }

    public String getDay(int day) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day >= 0 && day < 7) {
            return (daysOfWeek[day]);
        } else {
            return "day not exist";
        }
    }

    public String toyStore(int id) {
        //int id = Integer.parseInt(scanner.next());
        HashMap<Integer, String> toyById = new HashMap<Integer, String>();

        toyById.put( 12, "Batmobile");
        toyById.put( 45, "Light Saber");
        toyById.put( 6, "Wonder Woman");
        toyById.put( 201, "Hello Kitty Bag");
        toyById.put( 56, "Junior QA Analyst Doll");
        if (toyById.containsKey(id)){
        return toyById.get(id);
    } else{
            return "No such toy";
        }
}
    public void  arrayListNames(){
    ArrayList<String> names = new ArrayList<String>();
    names.add("Steve");
    names.add("Tim");
    names.add("Lucy");
    names.add("Steve");
    names.add("Pat");
    names.add("Angela");
    names.add("Tom");
    names.add("Tim");
    names.add("Anna");
    names.add("Lucy");
        for (String name: names);
        System.out.println(names);
        System.out.println();

        System.out.println("There are names in the list: " + names.size());
        System.out.println();

        Collections.sort(names);
        for (String name: names);
        System.out.println(names);

        System.out.println();

        ArrayList<String> result = new ArrayList<String>();

        for (int i = 0; i < names.size()-1; i++){
            if (names.get(i) != names.get(i + 1)){
               result.add(names.get(i));
           }
       }
        System.out.println(result);
       System.out.println();
        System.out.println("There are names in the list: " + result.size());
    }
}