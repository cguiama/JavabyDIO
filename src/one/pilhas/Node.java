package one.pilhas;

public class Node {

    private int dado;
    private Node refNo = null;

    public Node() {
    }

    public Node(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public Node getRefNo() {
        return refNo;
    }

    public void setRefNo(Node reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "Node{" +
                "dado=" + dado +
                '}';
    }
}
