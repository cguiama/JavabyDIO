package com.projetonode;

public class Main {
    public static void main(String[] args) {

        Node<String> no1 = new Node<>("Conteudo no1");

        Node<String> no2 = new Node<>("Conteudo no2");
        no1.setProximoNode(no2);

        Node<String> no3 = new Node<>("Conteudo no3");
        no2.setProximoNode(no3);

        Node<String> no4 = new Node<>("conteudo no4");
        no3.setProximoNode(no4);
    }
}
