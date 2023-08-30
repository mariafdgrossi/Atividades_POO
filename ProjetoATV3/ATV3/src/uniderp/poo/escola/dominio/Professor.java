package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Professor extends Pessoa{

    String registro;
    LocalDate DataContratacao;

    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getDataContratacao() {
        return DataContratacao;
    }
    public void setDataContratacao(LocalDate dataContratacao) {
        DataContratacao = dataContratacao;
    }

    public Professor(){

    }
    public Professor(String registro, LocalDate dataContratacao) {
        this.registro = registro;
        DataContratacao = dataContratacao;
    }
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String registro, LocalDate dataContratacao) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.registro = registro;
        DataContratacao = dataContratacao;
    }
    
}
