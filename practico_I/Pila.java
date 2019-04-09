package practico_I;

public class Pila {
    protected MySimpleLinkedList pila;
    
    public Pila(){
        this.pila = null;
    }
    
    
    public void push(Object o){
        this.pila.insertFront(o);
    }
    
    public Object top(){
        return this.pila.get(1);
    }
    
    public Object pop(){
        return this.pila.extractFront();
    }
    
}