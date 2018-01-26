package connectedList;

public class connectedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listManager mng=new listManager();
		mng.insert(3);
		mng.insert(5);
		mng.insert(6);
		System.out.println(mng.listTostring());
		mng.deleteNode(6);
		System.out.println(mng.listTostring());
	}

}
