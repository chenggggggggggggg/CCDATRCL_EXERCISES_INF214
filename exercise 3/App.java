import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<String> dress_stack = new Stack<>();

        // arranging t-shirts in a stack
        dress_stack.push("Pink dress");
        dress_stack.push("Red dress");
        dress_stack.push("Black dress");
        dress_stack.push("Yellow dress");

        // Show the size of the stack
        System.out.println("The size of the stack is: " + dress_stack.size());

        // Show top element in the stack
        System.out.println("The top of the stack is: " + dress_stack.peek());

        // Remove top element in the stack
        dress_stack.pop();

        System.out.println("After pop");

        // Show all elements in Stack
        System.out.println("Dress in Stack: " + dress_stack);

        // Show top element in the stack
        System.out.println("The top of the stack is: " + dress_stack.peek());

    }
}