package uniderp.poo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends Pessoa{

    String matricula;
    LocalDate DataMatricula; 


    public String getMatricula() {
        return matricula;
    }



    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }



    public LocalDate getDataMatricula() {
        return DataMatricula;
    }



    public void setDataMatricula(LocalDate dataMatricula) {
        DataMatricula = dataMatricula;
    }


    public Aluno(){

    }


    public Aluno(String matricula, LocalDate dataMatricula) {
        this.matricula = matricula;
        DataMatricula = dataMatricula;
    }



    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimento, String rg,
            String cpf, LocalDate dataInsercao, String matricula, LocalDate dataMatricula) {
        super(codigo, nome, endereco, telefone, dataNascimento, rg, cpf, dataInsercao);
        this.matricula = matricula;
        DataMatricula = dataMatricula;
    }

    

}
