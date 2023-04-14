package com.filas;

public class Fila<T> {

    private Node<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object){
        Node novoNode = new Node(object);
        novoNode.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNode;
    }

    public T first(){
        if(!this.isEmpty()){
            Node primeiroNode = refNoEntradaFila;
            while(true){
                if(primeiroNode.getRefNo() != null){
                    primeiroNode = primeiroNode.getRefNo();
                }
                else{
                    break;
                }
            }
            return (T) primeiroNode.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node noAuxiliar = refNoEntradaFila;
            Node primeiroNode = refNoEntradaFila;
            while(true){
                if(primeiroNode.getRefNo() != null){
                    noAuxiliar = primeiroNode;
                    primeiroNode = primeiroNode.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNode.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        Node nodeAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null) {
            while (true)
            {
                stringRetorno += "[Node{Objeto= " + nodeAuxiliar.getObject() + "}]--->";
                if(nodeAuxiliar.getRefNo() != null)
                {
                    nodeAuxiliar = nodeAuxiliar.getRefNo();
                }
                else
                {
                    stringRetorno = "null";
                    break;
                }
            }
        }
        else
        {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
