package DS1;

@SuppressWarnings("hiding")
public class Node<Marker>
{
	private Marker data;

	private Node<Marker> next;
	private Node<Marker> prev;

	public Node ()
	{
		prev = null;
		data=null;
		next = null;
	}




	public Node(Node<Marker> prev,Marker data, Node<Marker> next) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}




	public Marker getData() {
		return data;
	}




	public void setData(Marker data) {
		this.data = data;
	}




	public Node<Marker> getNext() {
		return next;
	}




	public void setNext(Node<Marker> next) {
		this.next = next;
	}




	public Node<Marker> getPrev() {
		return prev;
	}




	public void setPrev(Node<Marker> prev) {
		this.prev = prev;
	}




	public String toString()
	{
		return data.toString();
	}
}
