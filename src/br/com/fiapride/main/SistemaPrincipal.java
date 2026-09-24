package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {

    public static void main(String[] args) {
        Garrafa minhaGarrafa = new Garrafa();
        minhaGarrafa.cor = "Amarelo";
        minhaGarrafa.material = "Metal";
        //Fabriquei a segunda (Instância 2)
        Garrafa garrafaDoProfessor = new Garrafa();
        garrafaDoProfessor.cor = "Metálico";
        garrafaDoProfessor.material = "Alumínio";

        System.out.println("Minha garrafa é: " + minhaGarrafa.cor);
        System.out.println("A do professor é: " + garrafaDoProfessor.cor);
    }
}
