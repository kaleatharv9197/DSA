package linkedList;
import java.util.*;

public class Doubly_Linked_List 
{
   Dnode root;
    void insert_left(int data)
    {
        Dnode n=new Dnode(data);
        if(root==null)
            root=n;//1
        else
        {
            n.right=root;//1
            root=n;//2
        }
    }
    void insert_right(int data)
    {
    	Dnode n=new Dnode(data);
        if(root==null)
            root=n;//1
        else
        {//go to right most and link the new node
        	Dnode t=root;//1
            while(t.right!=null)//not at end 2
                t=t.right;
            t.right=n;//3 linked to last/rightmost
            n.left=t;//4
        }
    }
    void delete_left()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
        	Dnode t= root;//1st
        	if(root.right==null)
        		root=null;
        	else {
            root=root.right;//2
            root.left=null;//3
            System.out.println("Deleted:"+t.data);//4
        }
    }

  }
    void delete_right()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
        	Dnode t= root;//1st
        	Dnode t2=root;//1st
            while(t.right!=null)//2
            {
                t2=t;//tail
                t=t.right;//forward
               
            }
            if(root.right==null)
                root=null;//manual deletion
            else
            	t2=t.left;
                t2.right=null;//3
            System.out.println("Deleted:"+t.data);//3
        }
    }
    void print_list()
    {
        if(root==null)
            System.out.println("\nEmpty list. ");
        else
        {
        	Dnode t=root;//1
            while(t!=null)//2
            {
                System.out.print("<-|"+t.data+"|->");
                t=t.right;
            }
        }
    }
            void print_list_reverse()
            {
                if(root==null)
                    System.out.println("\nEmpty list. ");
                else
                {
                	Dnode t=root;//1
                    while(t.right!=null)//2
                    	t=t.right;
                    while (t != null)
                    {
                        System.out.print("<-|" + t.data + "|->");
                        t = t.left;
                    }
                    System.out.print("NULL");
                }

            }
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Doubly_Linked_List obj = new Doubly_Linked_List();

                    int choice = 0, data, key, ref;

                    do {
                        System.out.print("\n\n===== Doubly Linked List Menu =====");
                        System.out.print("\n1. Insert Left");
                        System.out.print("\n2. Insert Right");
                        System.out.print("\n3. Delete Left");
                        System.out.print("\n4. Delete Right");
                        System.out.print("\n5. Print List");
                        System.out.print("\n6. Print Reverse List");
                        System.out.print("\n0. Exit");
                        System.out.print("\nEnter choice: ");

                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("Enter data: ");
                                data = sc.nextInt();
                                obj.insert_left(data);
                                break;

                            case 2:
                                System.out.print("Enter data: ");
                                data = sc.nextInt();
                                obj.insert_right(data);
                                break;

                            case 3:
                                obj.delete_left();
                                break;

                            case 4:
                                obj.delete_right();
                                break;

                            case 5:
                                obj.print_list();
                                break;

                            case 6:
                                obj.print_list_reverse();
                                break;

                            case 0:
                                System.out.print("\nExiting... Career Credentials Mode OFF 🚀");
                                break;

                            default:
                                System.out.print("\nInvalid choice. Try again.");
                        }

                    } while (choice != 0);
                }

}