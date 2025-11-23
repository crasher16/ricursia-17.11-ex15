package ex1;

import unit4.collectionsLib.Stack;

//---------------------------------------------------------------
// Move top element to bottom
// Developer: עידן דרור
// Description: Moves the top element of the stack to the bottom
// without removing any other element.
//---------------------------------------------------------------

public class MoveTopToBottom {

    public static void moveTopToBottom(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();

        // Step 1: remove the top element
        int top = s.pop();

        // Step 2: move all elements to temp
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        // Step 3: push the original top element to bottom
        s.push(top);

        // Step 4: restore all elements back
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void printStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<>();
        System.out.print("[");
        boolean first = true;

        while (!s.isEmpty()) {
            int x = s.pop();
            temp.push(x);
            if (!first) System.out.print(", ");
            System.out.print(x);
            first = false;
        }
        System.out.println("]");

        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.print("Before: ");
        printStack(s);

        moveTopToBottom(s);

        System.out.print("After:  ");
        printStack(s);
    }
}
