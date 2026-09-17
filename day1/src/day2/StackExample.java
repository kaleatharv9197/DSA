package day2;

import java.util.Scanner;

public class StackExample {

    int tos, maxSize;
    int[] stack;

    void create_Stack(int size) {
        maxSize = size;
        tos = -1;
        stack = new int[maxSize];
    }

    void push(int e) {
        if (is_full()) {
            System.out.println("\nStack Full");
        } else {
            tos++;
            stack[tos] = e;
        }
    }

    boolean is_full() {
        return tos == maxSize - 1;
    }

    int pop() {
        if (is_empty()) {
            System.out.println("\nStack Empty");
            return -1;
        }

        int temp = stack[tos];
        tos--;
        return temp;
    }

    boolean is_empty() {
        return tos == -1;
    }

    int peek() {
        if (is_empty()) {
            System.out.println("\nStack Empty");
            return -1;
        }

        return stack[tos];
    }

    void print_stack() {
        if (is_empty()) {
            System.out.println("\nStack Empty");
            return;
        }

        for (int i = tos; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
   
}

 