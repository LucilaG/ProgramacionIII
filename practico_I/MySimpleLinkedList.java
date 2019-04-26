package practico_I;

import java.util.Iterator;

public class MySimpleLinkedList {

    protected Node first;

    public MySimpleLinkedList() {
        first = null;
    }

    public void insertFront(Object o) {
        Node tmp = new Node(o, null);
        tmp.setNext(first);
        first = tmp;
    }

    public Object get(int index) {
        int count = 0;
        Node tmp = this.first;
        while (count < index) {
            tmp = tmp.getNext();
            count++;
        }
        return tmp;
    }
    	public Object extractFront() {
		return null;
	}

    public void print(int n) {
        Node tmp = new Node();
        for (int i = 0; i < n; i++) {
            System.out.print(tmp.getNext());
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        Node tmp = new Node();
        int size = 0;
        while (tmp.getNext() != null) {
            size++;
        }
        return size;
    }
    
    public Iterator<Object> iterator() {
		return new MySimpleLinkedListIterator(this.first);
	}
	
public boolean contiene(Object o){
	return first.equals(o);	
	}
}
