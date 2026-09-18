package linkedList;
import java.util.*;
public class Circular_Linked_List
{
    Node root,last;

    void insert_left(int data)
    {
        Node n=new Node(data);//create a node

        if(root==null)//only 1st time
        {
            root=last=n;
            last.next=root;
        }
        else
        {
            n.next=root;//1
            root=n;//2
            last.next=root;//3
        }

    }

    void insert_right(int data)
    {
        Node n=new Node(data);//create a node

        if(root==null)//only 1st time
        {
        	 root=last=n;
        	 last.next=root;
        }
        else
        {
        	last.next=n;//1
        	last=n;//2
        	last.next=root;//3
        }
    }

    void delete_left()
    {
        if(root==null)
            System.out.print("\nEmpty List");
        else
        {
            Node t=root;//1

            if(root==last)//single node
            {
                root=last=null;
            }
            else
            {
                root=root.next;//2
                last.next=root;//3
            }

            System.out.print("\n|"+t.data+"|-> deleted");

        }
    }

    void delete_right()
    {
        if(root==null)
            System.out.print("\nEmpty List");
        else
        {
            Node t,t2;

            t=t2=root;//1

            if(t==t2)//single node
            {
                root=last=null;//manual deletion
            }
            else
            {
                while(t!= null)//2
                {
                  t2=  t;
                 t  = t.next;
                }

                last=t2;//3
                last.next=root;//4
            }

            System.out.print("\n|"+t.data+"|-> deleted");
        }
    }

    void print_list()
    {
        if(root==null)
            System.out.print("\nList Empty");
        else
        {
            Node t=root;

            do
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }while(t!=root);
        }
    }
}

