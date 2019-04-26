public class ArbolBinario{

public ArbolBinario(Nodo nodoRaiz){
this.nodoRaiz = nodoRaiz;
}

    public void insert(Objecto o){

        if(nodoRaiz != null){
          if(o< this.nodoRaiz) ? this.nodoRaiz.hojaIzq.insert(o): this.nodoRaiz.hojaDer.insert(o) ;
        }else{
        Nodo nodoAux = new Nodo();
        nodoAux.raiz = o;
        nodoAux.hojaDer = new Nodo();
        nodoAux.hojaIzq = new Nodo();
        this.nodoRaiz = nodoAux;
        }
    }
    
    public List getFrontera(){
    
    }
    
    
}
