package connectedList;

public class listNode {
	int data;
	listNode next;
	listNode prev;
	
	public listNode(int key) {
		this.data=key;
		this.next=null;
		this.prev=null;
	}
}
