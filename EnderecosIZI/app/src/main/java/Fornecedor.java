public class Fornecedor {
    private String oque;
    private String nomeLoja;
    private String endLoja;

    public Fornecedor(String oque, String nomeLoja, String endLoja){
        this.oque = oque;
        this.nomeLoja = nomeLoja;
        this.endLoja = endLoja;
    }


    public String toString() {
        return "O que: " + oque + ", na loja " + nomeLoja + ", no endereco: " + endLoja + "\n";
    }

    public String getOque(){
        return oque;
    }

    public void setOque(String oque){
        this.oque = oque;
    }

    public String getNomeLoja(String nomeLoja){
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja){
        this.nomeLoja = nomeLoja;
    }

    public  String getEndLoja(String endLoja){
        return endLoja;
    }

    public void setEndLoja(String endLoja){
        this.endLoja = endLoja;
    }


}
