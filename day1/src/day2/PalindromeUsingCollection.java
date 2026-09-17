package day2;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeUsingCollection {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        // Create Stack Collection
        Stack<Character> stack = new Stack<>();

        // Push each character into Stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Create reverse string
        StringBuilder reverse = new StringBuilder();

        // Pop characters from Stack
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        // Check palindrome
        if (str.equals(reverse.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}