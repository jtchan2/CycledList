import java.uitl.*;
public class CycledList<E>{
	public class Node<E>{
		E data;
		Node<E> head;
		public Node(E value){
			this.date=value;
			next=null;

		}
	}
	public int cycles(Node head){
		Node curr= head;
		List<CycledList> tracker= new ArrayList<ListNode>();
		//keeps records of nodes usage
		while(curr!=null){
			//if the tail connects to a part of Linked list returns index of where it is from tracker arraylist else just keeps looping
			if(tracker.contains(curr)){
				return tracker.indexOf(curr);
			}else{
				tracker.add(curr);
			}
			curr=curr.next;
		}
		//-1 returned if tail.next either equals null or is jsut a single node
		return -1;

	}
}