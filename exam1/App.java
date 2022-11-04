import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {

        // ARRAYS
        // ======================================================
        // 1. Create an array of characters of your Subject.
        char[] Subject = { 'P', 'A', 'L', 'L', 'E', 'R' };

        // 2. Print each character of your Subject on each line.
        for (int i = 0; i < Subject.length; i++) {
            System.out.println(Subject[i]);
        }

        // 3. Print the first character of your Subject.
        System.out.println("The First Character of my Subject is " + Subject[0]);

        // 4. Print the last character of your Subject.
        System.out.println("The Last Character of my Subject is " +Subject[5]);

        // 5. Print the character of your Subject in reverse order.
        for (int i = Subject.length - 1; i >= 0; i--) {
            System.out.println(Subject[i]);
        }

        // Linked List
        // ======================================================
        // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.

        LinkedList<String> StudentNumber = new LinkedList<>();

        StudentNumber.add("1");
        StudentNumber.add("0");
        StudentNumber.add("6");
        StudentNumber.add("3");
        StudentNumber.add("6");
        StudentNumber.add("8");

        System.out.println(StudentNumber);

        // 2. Add an asterisk (*) to the head/front of the Linked list.

        StudentNumber.addFirst("*");

        System.out.println(StudentNumber);
        
        // 3. Add an asterisk (*) to the tail/end of the Linked list.
        StudentNumber.addLast("*");

        //Print the Linked list.
        System.out.println(StudentNumber);

        // 4. Display the last character of the Linked list
        System.out.println(StudentNumber.get(7));

        // 5. Replace the last character of the Linked list with "!";
        StudentNumber.set(7, "!");

        // 6. Remove the first character of the Linked list
        StudentNumber.remove(0);

        // // 7. Display the LinkedList
        System.out.println(StudentNumber);

        // Stack
        // ======================================================
        // 1. Create a Stack of characters of your Subject.

        Stack<String> Subject = new Stack<>();

        Surname.push("P");
        Surname.push("A");
        Surname.push("L");
        Surname.push("L");
        Surname.push("E");
        Surname.push("R");

        // 2. Print the Stack
        System.out.println(Surname);

        // 3. Add a "INF214" to the stack.

        Section.push("I");
        Section.push("N");
        Section.push("F");
        Section.push("2");
        Section.push("1");
        Sectiom.push("4");

        // 4. Print the Stack
        System.out.println(Section);

        // 5. Remove "INF214" and Add "CCDATRCL-INF214".
        Subject.pop();
        Subject.pop();
        Subject.pop();
        Subject.pop();
        Subject.pop();

        Subject.push("C");
        Subject.push("C");
        Subject.push("D");
        Subject.push("A");
        Subject.push("T");
        Subject.push("R");
        Subject.push("C");
        Subject.push("L");
        Subject.push("-");
        Subject.push("I");
        Subject.push("N");
        Subject.push("F");
        Subject.push("2");
        Subject.push("1");
        Subject.push("4");
        

        // 6. Print the Stack
        System.out.println(Subject);
    }
}

    
