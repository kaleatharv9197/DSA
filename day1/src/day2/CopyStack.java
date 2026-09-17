package day2;

import java.util.Scanner;

class Stack {

    int[] arr;
    int top;
    int size;

    // Constructor
    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Copy Constructor
    Stack(Stack s) {
        this.size = s.size;
        this.arr = new int[s.size];
        this.top = s.top;

        for (int i = 0; i <= s.top; i++) {
            this.arr[i] = s.arr[i];
        }
    }

    // Push
    void push(int value) {

        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    // Print
    void print() {

        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }

        if (top != -1) {
            System.out.println("Top → " + arr[top]);
        }
    }
}

public class CopyStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack original = new Stack(size);

        System.out.println("Enter elements:");

        for (int i = 0; i < size; i++) {
            int value = sc.nextInt();
            original.push(value);
        }

        // Create copy
        Stack copied = new Stack(original);

        System.out.println("\nOriginal Stack:");
        original.print();

        System.out.println("\nCopied Stack:");
        copied.print();

        sc.close();
    }
}