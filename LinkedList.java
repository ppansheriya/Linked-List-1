
public class LinkedList {

	
	
	public static class Node
	{
		int data;
		Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}
	
	static Node head;
	public Node reverse(Node head)
	{
		Node prev = null;
	    Node current = head;
	    Node next = null;
	    
	    while(current!=null){
	        next = current.next;
	        current.next = prev;
	        prev = current;
	        current = next;
	    }
	    head = prev;
	    return prev;
	}
	
	
	void printlist(Node head) {
		while(head != null) {
			System.out.println(head.data+" ");
			head = head.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4)	;
		
		head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printlist(head); 
		
	}


}
