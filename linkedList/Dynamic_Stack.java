package linkedList;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Dynamic_Stack {

	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Create Stack
	        LinkedList<Integer> stack = new LinkedList<Integer>();

	        int choice;
	        int value;

	        do {

	            System.out.println("\n===== STACK MENU =====");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Print");
	           System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    // Push
	                    System.out.print("Enter value: ");
	                    value = sc.nextInt();

	                    stack.addFirst(value);

	                    System.out.println("Element inserted.");
	                    break;

	                case 2:
	                    // Pop
	                    if (stack.isEmpty()) {
	                    	System.out.println("Deleted element: " + stack.removeFirst());
	                    } else 
	                    {
	                        System.out.println("Stack is Empty.");
	                    }
	                    break;

	                case 3:
	                    // Peek
	                    if (!stack.isEmpty()) {
	                        System.out.println("Top element: " + stack.getFirst());
	                    } else {
	                        System.out.println("Stack is Empty.");
	                    }
	                    break;
	                case 4:
	                    // Print
	                    System.out.println("Stack: " + stack);
	                    break;
	                case 5:
	                    System.out.println("Program Ended.");
	                    break;
	                default:
	                    System.out.println("Invalid Choice.");
	            }

	        } while (choice!=5);

	        sc.close();
	    }
}
