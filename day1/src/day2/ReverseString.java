package day2;

import java.util.Scanner;

public class ReverseString {

    int tos, maxSize;
    char[] stack;

    void create_Stack(int size) {
        maxSize = size;
        tos = -1;
        stack = new char[maxSize];
    }

    boolean is_full() {
        return tos == maxSize - 1;
    }

    boolean is_empty() {
        return tos == -1;
    }

    void push(char ch) {
        if (!is_full()) {
            tos++;
            stack[tos] = ch;
        }
    }

    char pop() {
        if (!is_empty()) {
            char temp = stack[tos];
            tos--;
            return temp;
        } else {
            return '\0';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        ReverseString obj = new ReverseString();

        obj.create_Stack(str.length());

        // Push characters into stack
        for (int i = 0; i < str.length(); i++) {
            if (!obj.is_full()) {
                obj.push(str.charAt(i));
            }
        }

        // Create StringBuilder
        StringBuilder reverse = new StringBuilder();

        // Pop until stack becomes empty
        while (!obj.is_empty()) {
            reverse.append(obj.pop());
        }

        System.out.println("Reverse string: " + reverse);

        sc.close();
    }
}
