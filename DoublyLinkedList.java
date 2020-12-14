package DS1;

import java.util.NoSuchElementException;

@SuppressWarnings("hiding")
public class DoublyLinkedList <Marker>
{

	private Node<Marker> front;
	private Node<Marker> rear;
	private int size;

	public DoublyLinkedList()
	{
		front =null;
		rear = null;
		size = 0;
	}

	public int size() 
	{
		return size;
	}



	public void addToRear(Marker data)
	{
		rear = new Node<Marker> (); 
		if(front==null)
			front =rear;

		if(rear.getPrev()!=null)
			rear.getPrev().setNext(rear);
		size++;
	}

	public void addToFront(Marker data)
	{
		front = new Node<Marker>();
		if(size ==0)
			rear = front;
		if(front.getNext()!=null)
			front.getNext().setPrev(front);
		size++;


	}


	// should throw NoSuchElementException if it can't remove


	public Marker removeFromRear() {
		Marker temp;
		if(size==0)
			throw new NoSuchElementException("Element not there");
		else if(size ==1 )
		{
			temp=rear.getData();
			front = null;
			rear=null;

		}
		else
		{
			//if(rear!=null)
			temp = rear.getData();

			rear =rear.getPrev();
			rear.setNext(null);


		}
		size--;
		return temp; 

	}
	// should throw NoSuchElementException if it can't remove
	public Marker removeFromFront() 
	{

		Marker temp;
		if(size==0)
			throw new NoSuchElementException("Element not there");
		else if(size ==1 )
		{
			temp=front.getData();
			front = null;
			rear=null;
		}
		else
		{
			temp=front.getData();
			front = front.getNext();
			front.setPrev(null);

		}
		size--;
		return temp; 

	}

	// takes in 0 based position, should throw NoSuchElementException if it can't remove
	public Marker get(int pos)
	{
		//Marker current;
		int count;
		Node <Marker> temp;
		if(size==0)
			throw new NoSuchElementException("Element not there");
		else

		{
			count = 0;
			temp = front; 
			while((count!=pos)&&(temp!=null))
			{
				count++;	
				temp=temp.getNext();
			}

			if(pos>size)
			{
				throw new NoSuchElementException("Element not in Doubly Linked List");
			}

		}
		return temp.getData();
	}

	public String search(String theCat)
	{
		String toReturn=new String();

		Node <Marker> current = front;
		
		while(current!=null)
		{
			Marker theMarks =current.getData();
			if((theMarks.getCategory()).equals(theCat))
					toReturn+= current.getData().toString()+"\n";
					
		}
			return toReturn;
		}


		public String toString()
		{
			StringBuilder theString = new StringBuilder();
			Node <Marker> current = front;

			while (current!=null)

			{
				theString.append(current.getData().toString()+"\n");
				current =current.getNext();
			}
			return theString.toString();
		}

		public String reverseString()
		{
			StringBuilder theString = new StringBuilder();
			Node <Marker> current = rear;

			while (current!=null)
			{

				theString.append(current.getData().toString()+"\n");
				current = current.getPrev();
			}
			return theString.toString();
		}
}
