package practico_2;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {

	private Nodo nodoRaiz;

	public ArbolBinario(Nodo nodoRaiz) {
		this.nodoRaiz = nodoRaiz;
	}

	public Nodo getNodoRaiz() {
		return nodoRaiz;
	}

	public void setNodoRaiz(Nodo nodoRaiz) {
		this.nodoRaiz = nodoRaiz;
	}

	public void insert(Nodo o) {
		if (this.nodoRaiz != null) {
			if (this.nodoRaiz.esMenor(o.raiz)) {
				this.nodoRaiz.hojaIzq.insert(o);
			} else {
				this.nodoRaiz.hojaDer.insert(o);
			}
		} else {
			Nodo nodoAux = new Nodo();
			nodoAux.raiz = o.raiz;
		}
	}

	public List<Nodo> getFrontera() {
		List<Nodo> listAux = new ArrayList<>();
		listAux.addAll(this.getInorder(this.nodoRaiz));
		return listAux;
	}

	public List<Nodo> getInorder(Nodo o) {
		List<Nodo> listAux = new ArrayList<>();
		if (o == null) {
			return listAux;
		}
		listAux.addAll(this.getPostorder(o.hojaIzq));
		listAux.addAll(this.getPostorder(o.hojaDer));
		return listAux;
	}

	public List<Nodo> getPostorder(Nodo o) {
		List<Nodo> listAux = new ArrayList<>();
		if (o == null) {
			return listAux;
		}
		listAux.addAll(this.getPostorder(o.hojaIzq));
		listAux.addAll(this.getPostorder(o.hojaDer));
		return listAux;
	}
}
