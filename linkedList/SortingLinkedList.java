package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SortingLinkedList {
	
	   Node root;


	    // 1. Add data at the end of the linked list
	    void insert_right(int data)
	    {
	        Node n = new Node(data);

	        if(root == null)
	            root = n;
	        else
	        {
	            Node t = root;

	            while(t.next != null)
	                t = t.next;

	            t.next = n;
	        }
	    }


	    // 2. Print the linked list
	    void print_list()
	    {
	        if(root == null)
	            System.out.println("\nEmpty list.");
	        else
	        {
	            Node t = root;

	            while(t != null)
	            {
	                System.out.print("|" + t.data + "|->");
	                t = t.next;
	            }

	            System.out.println("NULL");
	        }
	    }


	    // 3. Sort the linked list
	    // Bubble Sort - swap data, not nodes
	    void sort_list()
	    {
	        for(Node i = root; i.next != null; i = i.next)
	        {
	            for(Node j = root; j.next != null; j = j.next)
	            {
	                if(j.data > (j.next).data)
	                {
	                    // Swap data, not nodes
	                    int temp = j.data;
	                    j.data = (j.next).data;
	                    (j.next).data = temp;
	                }
	            }
	        }
	      
	    }


	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        SortingLinkedList obj = new SortingLinkedList();

	        int n;
	        int data;

	        // ==========================================
	        // 1. CREATE LINKED LIST
	        // ==========================================

	        System.out.print("How many elements: ");
	        n = sc.nextInt();

	        System.out.println("Enter elements:");

	        for(int i = 1; i <= n; i++)
	        {
	            data = sc.nextInt();

	            // Add each element at the end
	            obj.insert_right(data);
	        }


	        // ==========================================
	        // 2. PRINT UNSORTED LIST
	        // ==========================================

	        System.out.println("\nUnsorted Linked List:");
	        obj.print_list();


	        // ==========================================
	        // 3. SORT LINKED LIST
	        // ==========================================

	        obj.sort_list();


	        // ==========================================
	        // 4. PRINT SORTED LIST
	        // ==========================================

	        System.out.println("\nSorted Linked List:");
	        obj.print_list();


	        sc.close();
	    }
	}


					
				
			
			

