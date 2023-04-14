package com.projetonode;

public class Node<T> {

    private T conteudo;
    private Node<T> proximoNode;

    public Node(T conteudo)
    {
        this.proximoNode = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public Node<T> getProximoNode() {
        return proximoNode;
    }

    public void setProximoNode(Node<T> proximoNode) {
        this.proximoNode = proximoNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
