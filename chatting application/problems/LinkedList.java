package problems;
import java.util.*;

public class LinkedList {
    public Node head;
    
    class Node {
        String data;
        Node next;
        
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data){
        Node newNode=new Node(data);
        Node currentnode;
        if(head==null){
            head = newNode;
            return;           
        }
        currentnode=head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newNode;
    }
    
    public void printList() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + ",");
            currNode = currNode.next;
        }
        System.out.println(); 
    }
    
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addfirst("a");
        list.addfirst("b");
        list.addfirst("c");
        list.addlast("z");
        list.printList();
        
    }
}






