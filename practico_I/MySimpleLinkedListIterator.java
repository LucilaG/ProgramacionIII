package practico_I;

import java.util.Iterator;

public class MySimpleLinkedListIterator implements Iterator<Object>{
	private Node nodo;
	public MySimpleLinkedListIterator(Node nodo) {
		this.nodo = nodo;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return this.nodo != null;
	}

	@Override
	public Object next() {
		Object info = this.nodo.getInfo();
		this.nodo = this.nodo.getNext();
		return info;
	}
	
}
