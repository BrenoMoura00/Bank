package br.com.bank.model.entidades;

public class Endereco {
    private String nomeRua;
    private int numeroRua;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(String nomeRua, int numeroRua, String bairro, String cidade, String cep) {
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }

    public Endereco(Endereco endereco) {
        this.bairro = endereco.bairro;
        this.cep = endereco.cep;
        this.cidade = endereco.cidade;
        this.numeroRua = endereco.numeroRua;
        this.nomeRua = endereco.nomeRua;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public int getNumeroRua() {
        return numeroRua;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

//    public void setNomeRua(String nomeRua) {
//        this.nomeRua = nomeRua;
//    }
//
//    public void setNumeroRua(int numeroRua) {
//        this.numeroRua = numeroRua;
//    }
//
//    public void setBairro(String bairro) {
//        this.bairro = bairro;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public void setCep(String cep) {
//        this.cep = cep;
//    }

    @Override
    public String toString() {
        return "Endereco{" +
                "nomeRua='" + nomeRua + '\'' +
                ", numeroRua=" + numeroRua +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
