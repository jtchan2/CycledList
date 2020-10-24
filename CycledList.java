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
		while(curr!=null){
			if(tracker.contains(curr)){
				return tracker.indexOf(curr);
			}else{
				tracker.add(curr);
			}
			curr=curr.next;
		}
		return -1;

	}
}