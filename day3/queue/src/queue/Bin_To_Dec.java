package queue;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Bin_To_Dec {

    static int to_dec(String bin) {

        // Create Character Queue
        Queue<Character> queue = new LinkedList<>();

        // Insert each binary digit into Queue
        for(char c:bin.toCharArray()) {
        	

            // Add element to Queue
        	 queue.offer(c);
        }

        System.out.print("\nQueue has:" + queue);

        int sum = 0;

        // Process Queue until empty
        while(!queue.isEmpty()) {

            // Remove front character
            char c = queue.poll();

            // Convert character to integer
            int digit =(int) c;

            // Calculate decimal value
            sum = (int) (
                sum + (digit * Math.pow(digit,queue.size()))
            );
        }

        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Binary Number:");

        String bin = sc.next();

        int dec = to_dec( bin);

        System.out.println(
            "Number is Decimal:" + dec
        );
    }
}
