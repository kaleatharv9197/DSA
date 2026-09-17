package day2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        StackExample obj = new StackExample();

		        System.out.print("\nEnter size of stack: ");
		        int size = sc.nextInt();

		        obj.create_Stack(size);

		        int choice;

		        do {
		            System.out.print("\n\nStack Menu");
		            System.out.print("\n-----------");
		            System.out.print("\n1. Push");
		            System.out.print("\n2. Pop");
		            System.out.print("\n3. Peek");
		            System.out.print("\n4. Print");
		            System.out.print("\n0. Exit");
		            System.out.print("\nEnter choice: ");

		            choice = sc.nextInt();

		            switch (choice) {

		                case 1:
		                    if (!obj.is_full()) {
		                        System.out.print("\nEnter element to push: ");
		                        int e = sc.nextInt();
		                        obj.push(e);
		                    } else {
		                        System.out.println("\nStack Full");
		                    }
		                    break;

		                case 2:
		                    if (!obj.is_empty()) {
		                        System.out.println("\nElement popped: " + obj.pop());
		                    } else {
		                        System.out.println("\nStack Empty");
		                    }
		                    break;

		                case 3:
		                    if (!obj.is_empty()) {
		                        System.out.println("\nElement @ Peek: " + obj.peek());
		                    } else {
		                        System.out.println("\nStack Empty");
		                    }
		                    break;

		                case 4:
		                    System.out.println("\nElements on Stack:");
		                    obj.print_stack();
		                    break;

		                case 0:
		                    System.out.println("\nExiting code...");
		                    break;

		                default:
		                    System.out.println("\nInvalid option selected.");
		            }

		        } while (choice != 0);

		        sc.close();
		    }
		}