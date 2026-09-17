package day2;
import java.util.Scanner;
import java.util.Stack;

class ReverseWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read word
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Create Stack
        Stack<Character> stack =new Stack<>();
        String rWord="";
        // Push each character into Stack
        for (int i = 0; i < word.length(); i++) {

            char ch = stack.push(word.charAt(i));

            rWord= rWord + ch;
        }

        // Pop characters and print reversed word
        System.out.println("Reversed word: ");

        while (!stack.isEmpty()) {

            System.out.print(stack.pop());
        }

        sc.close();
    }
}
