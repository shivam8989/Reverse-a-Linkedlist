package LinkedList;
import java.util.LinkedList;
public class Reverse {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }
    public void addlast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        while(temp != null){
            System.out.print(temp.data+"->");
          temp =  temp.next;
        }
        System.out.println("null");
    }
    public void reverse(){
        Node previous = null;
        Node current = tail = head;
        Node next;
        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public static void main(String args []){
        Reverse list = new Reverse();
        list .addFirst(1);
        list.addlast(2);
        list.addFirst(3);
        list.addFirst(4);
        list.print();
        list.reverse();
        list.print();
    }
}
