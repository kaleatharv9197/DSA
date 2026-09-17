package queue;
import java.util.*;
public class LinkedlistMain {
			LinkedlistMain root;
		    private LinkedlistMain next;
		    private int data;

		    // Insert at left
		    void insert_left(int data) {

		        LinkedlistMain n = new LinkedlistMain();
		        n.data = data;

		        if (root == null)
		            root = n;
		        else {
		            n.next = root;
		            root = n;
		        }
		    }

		    // Insert at right
		    void insert_right(int data) {

		        LinkedlistMain n = new LinkedlistMain();
		        n.data = data;

		        if (root == null)
		            root = n;
		        else {
		            LinkedlistMain t = root;

		            while (t.next != null)
		                t = t.next;

		            t.next = n;
		        }
		    }

		    // Delete from left
		    void delete_left() {

		        if (root == null)
		            System.out.println("Empty list");

		        else {
		            LinkedlistMain t = root;
		            root = root.next;

		            System.out.println("Deleted: " + t.data);
		        }
		    }

		    // Delete from right
		    void delete_right() {

		        if (root == null)
		            System.out.println("Empty list");

		        else {
		            LinkedlistMain t = root;
		            LinkedlistMain t2 = root;

		            while (t.next != null) {
		                t2 = t;
		                t = t.next;
		            }

		            if (t == t2)
		                root = null;
		            else
		                t2.next = null;

		            System.out.println("Deleted: " + t.data);
		        }
		    }

		    // Print list
		    void print_list() {

		        if (root == null)
		            System.out.println("\nEmpty list.");

		        else {
		            LinkedlistMain t = root;

		            while (t != null) {
		                System.out.print("|" + t.data + "|->");
		                t = t.next;
		            }

		            System.out.println("NULL");
		        }
		    }

		    // Search element
		    void search_list(int key) {

		        if (root == null)
		            System.out.println("\nEmpty list.");

		        else {
		            LinkedlistMain t = root;

		            while (t != null) {

		                if (t.data == key)
		                    break;

		                t = t.next;
		            }

		            if (t == null)
		                System.out.println("\n" + key + " not found");
		            else
		                System.out.println("\n" + key + " found");
		        }
		    }

		    // Main method
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        LinkedlistMain list = new LinkedlistMain();
		        int choice;
		        int data;
		        int key;
		        do {

		            System.out.println("\n========== LINKED LIST MENU ==========");
		            System.out.println("1. Insert Left");
		            System.out.println("2. Insert Right");
		            System.out.println("3. Delete Left");
		            System.out.println("4. Delete Right");
		            System.out.println("5. Print List");
		            System.out.println("6. Search");
		            System.out.println("7. Exit");
		            System.out.println("======================================");

		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();

		            switch (choice) {

		                case 1:
		                    System.out.print("Enter data: ");
		                    data = sc.nextInt();
		                    list.insert_left(data);
		                    System.out.println("Inserted " + data + " at left.");
		                    break;
		                case 2:
		                    System.out.print("Enter data: ");
		                    data = sc.nextInt();
		                    list.insert_right(data);
		                    System.out.println("Inserted " + data + " at right.");
		                    break;
		                case 3:
		                    list.delete_left();
		                    break;
		                case 4:
		                    list.delete_right();
		                    break;
		                case 5:
		                    System.out.println("\nLinked List:");
		                    list.print_list();
		                    break;
		                case 6:
		                    System.out.print("Enter element to search: ");
		                    key = sc.nextInt();
		                    list.search_list(key);
		                    break;
		                case 7:
		                    System.out.println("Program exited.");
		                    break;
		                default:
		                    System.out.println("Invalid choice! Please try again.");
		            }

		        } while (choice != 7);

		        sc.close();
		    }
		}
