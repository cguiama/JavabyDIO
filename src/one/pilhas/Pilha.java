package one.pilhas;

public class Pilha {

    private Node refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(Node novoNode){
        Node refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNode;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public Node pop(){
        if(!this.isEmpty()){
            Node noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public Node top(){
        return refNoEntradaPilha;
    }
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String stringRetorno = "--------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "--------------\n";

        Node noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[Node{dado =" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}
