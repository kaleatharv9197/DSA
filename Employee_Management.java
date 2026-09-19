
////Create a perfect employee management system using a linked list where employee details like employee ID, employee name, and employee gender are stored in a node-like structure of a linked list. The functionality should be menu-driven, allowing:
//adding a new employee
//deleting an employee
//searching for an employee
//listing all employees
package linkedList;
import java.util.Scanner;
class Employee
{
    private int emp_id;
    private String name,gender;
    Employee(int eid,String n,String g)
    {
        name=n;
        gender=g;
        emp_id=eid;
    }
    //method to display
    void display()
    {
        System.out.println("\nEmployee ID:"+emp_id+"\tName:"+name+"\tGender:"+gender);
    }
    //method to get empid
    int get_Emp_id()
    {
        return emp_id;
    }
}
//create Enode that has data as Employee and reference as next
class Enode
{
    Employee data;
    Enode next;
    Enode(Employee data)
    {
        this.data=data;
        Enode next;
    }
}
public class Employee_Management
{
    Enode root;
    void insert(Employee data)//right
    {
            Enode n=new Enode(data);
            if(root==null)
                root=n;//1
            else
            {//go to right most and link the new node
                Enode t=root;//1
                while(t.next!=null)//not at end 2
                    t=t.next;
                t.next=n;//3 linked to last/rightmost
            }
        }
    void print_list()
    {
        if(root==null)
            System.out.println("\nEmpty list. ");
        else
        {
            Enode t=root;//1
            while(t!=null)//2
            {
                System.out.print("|"+t.data+"|->");
                t=t.next;
            }
        }
    }
    public static void main(String[] args) {
    	Employee_Management obj= new Employee_Management();
    	  obj.insert(new Employee(1,"aaaa","m"));
          obj.insert(new Employee(2,"bbbb","f"));
          obj.insert(new Employee(3,"cccc","m"));
          obj.insert(new Employee(4,"dddd","f"));
          obj.print_list();


    	
    }

   }

    
