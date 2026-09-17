package day2;
import java.util.*;
public class ReverseStringMain {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);

		    System.out.print("Enter string: ");
		    String str = sc.nextLine();

		    ReverseString obj = new ReverseString();

		    obj.create_Stack(str.length());

		    // Push each character
		    for (int i = 0; i < str.length(); i++) {

		        if (!obj.is_full()) {
		            obj.push(str.charAt(i));
		        }
		    }

		    // Store reversed string
		    StringBuilder reverse = new StringBuilder();

		    // Pop until stack is empty
		    while (!obj.is_empty()) {
		        reverse.append(obj.pop());
		    }

		    System.out.println("Reverse string: " + reverse);

		    sc.close();
		}

	}


