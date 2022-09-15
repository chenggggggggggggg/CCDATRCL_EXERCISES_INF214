import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

// Array

        String names;
        System.out.println("My Surname");


        String[] surname = { "PALLER"};
        String[] character = {"P", "A", "L", "L", "E", "R"};
        String[] first = {"P"};
        String[] last = {"R"};
        String[] reversed = {"RELLAP"}

        System.out.println("Surname");
        System.out.println(surname[0]);

        System.out.println("These are the each character of my surname");
        System.out.println(character [0]);
        System.out.println(character [1]);
        System.out.println(character [2]);
        System.out.println(character [3]);
        System.out.println(character [4]);
        System.out.println(character [5]);

        System.out.println("The first character of my surname");
        System.out.println(first [0]);

        System.out.println("The last character of my surname");
        System.out.println(last [0]);

        System.out.println("The reveresed character of my surname");
        System.out.println(reversed [0]);

//Linked List


        LinkedList<Integer> numbers = new LinkedList<String>();
        numbers.add("1");
        numbers.add("0");
        numbers.add("6");
        numbers.add("3");
        numbers.add("6");
        numbers.add("8");

        numbers.addFirst("*");

        numbers.addLast("*");

        System.out.println(numbers);

        System.out.println(numbers.get(5));

        numbers.set(5, "!");

        Integer removed_element = numbers.remove(0)

        System.out.println("Updated LinkedList: " + numbers);

//Stack

        Stack<String> surname_stack = new Stack<>();
        Stack<String> section_stack = new Stack<>();
        Stack<String> subject_stack = new Stack<>();

        surname.push("P");
        surname.push("A");
        surname.push("L");
        surname.push("L");
        surname.push("E");
        surname.push("R");

        System.out.println(surname);

        section.push("I");
        section.push("N");
        section.push("F");
        section.push("2");
        section.push("1");
        section.push("4");

        System.out.println(section);

        section.pop();
        section.pop();
        section.pop();
        section.pop();
        section.pop();
        section.pop();
        section.pop();

        subject.push("C");
        subject.push("C");
        subject.push("D");
        subject.push("A");
        subject.push("T");
        subject.push("R");
        subject.push("C");
        subject.push("L");
        subject.push("-");
        subject.push("I");
        subject.push("N");
        subject.push("F");
        subject.push("2");
        subject.push("1");
        subject.push("4");
    
        System.out.println(subject);


    }
}

    