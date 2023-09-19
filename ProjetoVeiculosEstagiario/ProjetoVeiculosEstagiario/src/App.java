import uniderp.poo.escola.dominio.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Carro c1 = new Carro(1, 
        "w11", 
        "Corolla", 
        "Cross", 
        2021, 
        2020, 
        "Toyota", 
        "Maria",
        "Cross", 
        2, 
        20, 
        40, 
        4, 
        4, 
        "Gaslina", 
        "MS", 
        "Campo Grande", 
        "Carro", 
        1, 
        8, 
        "7329853087", 
        "REZ87234", 
        (float)30, 
        0, 
        30,
        true);

        c1.Imprimir();

        
        
        Caminhao cm = new Caminhao(2, 
        "c10", 
        "Torpedo", 
        "1113", 
        1958, 
        1957, 
        "Mercedes", 
        "João", 
        "1113", 
        3, 
        900, 
        1000, 
        2, 
        6, 
        "Diesel", 
        "SP", 
        "São Paulo", 
        "Caminhão", 
        2, 
        3, 
        "984300294385", 
        "htp4-3452", 
        (float) 30, 
        (float) 10);
    
        cm.Imprimir();



        Onibus o1 = new Onibus(3, 
        "om32", 
        "Ônibus Viajem", 
        "2000", 
        2015, 
        2010, 
        "Volvo", 
        "Marcos", 
        "2000", 
        2, 
        209, 
        500, 
        5, 
        4, 
        "Óleo Diesel", 
        "AM", 
        "Manaus", 
        "ônibus", 
        2, 
        200, 
        "20993738753", 
        "TGD67432", 
        205, 
        true, 
        true,
        false, 
        true);

        o1.Imprimir();



        Motocicleta m1 = new Motocicleta(4, 
        "m14", 
        "BMW", 
        "R 1250", 
        2017, 
        2016, 
        "BMW", 
        "Alberto", 
        "R 1250", 
        1, 
        20, 
        25, 
        0, 
        2, 
        "Gasolina", 
        "Paraná", 
        "Iporã", 
        "Motocicleta", 
        1, 
        2, 
        "2030943975212", 
        "MDH37452", 
        5, 
        "Combustão");

        m1.Imprimir();



        Aviao a1 = new Aviao(5, 
        "av54", 
        "Boeing", 
        "747", 
        2020, 
        2019, 
        "Boeing CO", 
        "Azul", 
        "747", 
        1, 
        10000, 
        20000, 
        2, 
        2, 
        "QAV", 
        "MS", 
        "Campo Grande", 
        "Aeronave", 
        2, 
        300, 
        300, 
        "209498487298", 
        (float) 50, 
        (float) 50, 
        (float) 1000,
        300);

        a1.Imprimir();
    }
}
