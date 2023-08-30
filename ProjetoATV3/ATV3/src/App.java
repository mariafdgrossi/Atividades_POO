import java.time.LocalDate;

import uniderp.poo.escola.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        Professor p1 = new Professor();
        p1.setCodigo(1);
        p1.setRegistro("001");
        p1.setNome("Maria");
        p1.setRg("2329251");
        p1.setCpf("04944474199");
        p1.setDataContratacao(LocalDate.of(2000, 8, 12));
        p1.setDataInsercao(LocalDate.of(2000, 04, 2));
        p1.setDataNascimento(LocalDate.of(1982, 04, 18));
        p1.setEndereco("Rua aleatoria");
        p1.setTelefone("999481804");

        Aluno a2 = new Aluno();
        a2.setCodigo(2);
        a2.setDataMatricula(LocalDate.of(2001, 5, 20));
        a2.setNome("Joao");
        a2.setRg("2329251");
        a2.setCpf("04944474199");
        a2.setMatricula("002");
        a2.setDataInsercao(LocalDate.of(2000, 04, 2));
        a2.setDataNascimento(LocalDate.of(1982, 04, 18));
        a2.setEndereco("Rua aleatoria");
        a2.setTelefone("999481804");

    
    }      


}
