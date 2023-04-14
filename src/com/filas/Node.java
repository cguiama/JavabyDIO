package com.filas;

public class Node<T> {

    private T object;
    private Node<T> refNo;

    public Node(){}

    public Node(T object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getRefNo() {
        return refNo;
    }

    public void setRefNo(Node refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                '}';
    }
}
