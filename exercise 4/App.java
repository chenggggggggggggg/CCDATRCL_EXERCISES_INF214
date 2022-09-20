import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Queue<String> Classmate = new LinkedList<>();


        Classmate.add("Jap");
        Classmate.add("Jenina");
        Classmate.add("Marrianne");
        Classmate.add("Winna");
        Classmate.add("Luis");

        System.out.println("These are my classmates");

        System.out.println(Classmate.size());
        System.out.println(Classmate.peek());

        Classmate.remove();
        Classmate.remove();
        Classmate.remove();
        Classmate.remove();
        Classmate.remove();

        Classmate.add("Tristan");
        Classmate.add("Rizjake");
        Classmate.add("Neil");
        Classmate.add("Brandon");
        Classmate.add("Idel");

        System.out.println("These are the new sets of my classmate");
        System.out.println(Classmate.size());
        System.out.println(Classmate.peek());

    
    }
}