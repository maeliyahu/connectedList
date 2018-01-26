package connectedList;

public class listManager {
	listNode head;
	listNode tail;
	int size;
	
	public void insert(int key) {
		listNode toInsert=new listNode(key);
		listNode runner;
		if(head==null) {
			head=toInsert;
			tail=toInsert;
		}
		else {
			toInsert.prev=tail;
			tail.next=toInsert;
			tail=toInsert;
		}
		this.size++;
	}
	public void deleteNode(int key) {
		listNode toDelete;
		listNode runner=head;
		if(head==null)
			return;
		if((head.data==key)) {
			if(head==tail) 
				this.tail=null;
			else 
				head.next.prev=null;
			this.head=head.next;
		}
		else {
			while((runner.next!=null) && runner.data!=key)
				runner=runner.next;
			if(runner.data==key) {
				runner.prev.next=runner.next;
				if(runner.next!=null)
					runner.next.prev=runner.prev;
				else
					tail=runner.prev;
			}
		}
	}
	public String listTostring() {
		String toReturn="";
		listNode runner=this.head;
		while(runner!=null) {
			toReturn+="" + runner.data;
			runner=runner.next;
		}
		return toReturn;
	}
}
