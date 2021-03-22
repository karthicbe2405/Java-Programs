import java.util.*;

class Node{
    int value;
    Node next = null;
    Node prev = null;
}
public class DoublyLinkedList
{
    Node head,tail;
    public  void insert(int value){
        Node temp = new Node();
        
        temp.value = value;

        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            Node temp2 = head;
            if(head.value > value){
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            else if(tail.value < value){
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            else{
                while(temp2 != null){
                    if(temp2.value > value){
                        temp2.prev.next = temp;
                        temp.prev = temp2.prev;
                        temp.next = temp2;
                        temp2.prev = temp;
                        break;
                    }
                    temp2 = temp2.next;
                }
            }
        }
    }
    public  void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }
    public void delete(int value){
        Node temp = head;
        if(temp.value == value){
            head= head.next;
        }
        else if(tail.value == value){
            tail = tail.prev;
            tail.next = null;
        }
        else{
            while(temp.next != null){
                if(temp.value == value){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                temp = temp.next;
            }
        }
    }
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        DoublyLinkedList o1 = new DoublyLinkedList();
		System.out.println("Enter the number of values to be Inserted : ");
		int n = scan.nextInt();
		System.out.println("Enter the values : ");
		for(int i = 0;i < n;i++){
		    o1.insert(scan.nextInt());
		}
	   System.out.println("The values in the list : ");
	        o1.display();
	   System.out.println("Enter the value to be deleted  : ");
	        int value = scan.nextInt();
	   o1.delete(value);
	   System.out.println("The values in the list : ");
	        o1.display();
	}
}