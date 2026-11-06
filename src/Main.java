import java.util.Stack;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create a stack
        Stack<String> myStack =new Stack<>();

        //Push: add from the top
        myStack.push("T");
        myStack.push("A");
        myStack.push("N");
        myStack.push("D");
        myStack.push("O");
        myStack.push("H");
        System.out.println(myStack);

        //is_empty:Check whether the stack is empty
        System.out.println("Is the stack empty? " + myStack.isEmpty());

        //Top(peek): View the top item without removing it
        System.out.println("The top item in the stack is " + myStack.peek());

        //Pop: Remove the top item & display it
        String removedItem= myStack.pop();
        System.out.println(removedItem);
        System.out.println(myStack);

        //Destroy: remove the whole stack and delete the whole stack
        myStack.clear();
        System.out.println(myStack);
        /* myStack = null;
        System.out.println(myStack);
         */
    }
}