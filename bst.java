package bst;
import java.util.*;
class Node{
    int value;
    Node left = null;
    Node right = null;
}
public class bst {
    Node root;
    public Node insert(Node temp,int value){
                if(temp == null){
                    temp = new Node();
                    temp.value = value;
                    if(root == null)
                        root = temp;
                    return temp;
                }
                if(value < root.value)
                    temp.left = insert(temp.left,value);
                
                if(value > root.value)
                    temp.right = insert(temp.right,value);

                //return root;
    }
    public void inOrder(Node temp){
            if(temp != null){
                System.out.println(temp.value);
                inOrder(temp.left);
                inOrder(temp.right);
            }        
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
		bst o1 = new bst();
		System.out.println("Enter the number of values to be Inserted : ");
		int n = scan.nextInt();
		System.out.println("Enter the values : ");
		for(int i = 0;i < n;i++){
		    o1.root = o1.insert(o1.root,scan.nextInt());
		}
        o1.inOrder(o1.root);
        //System.out.println(o1.root.left.value);
    }
}