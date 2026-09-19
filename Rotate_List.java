package linkedList;
import java.util.*;
public class Rotate_List {
			
	public static void main(String[]args) {
		Scanner  sc=new Scanner(System.in);
		LinkedList list= new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println("\n List has:"+list);
		System.out.println("Enter Number Of Rotation");
		int r= sc.nextInt();
		
		for(int i=1;i<=r;i++) {
			list.addFirst(list.removeLast());
			//list.addLast(list.removeFirst());
			System.out.println("\npass"+i+"\tlist:"+list);
		}
	}
}
