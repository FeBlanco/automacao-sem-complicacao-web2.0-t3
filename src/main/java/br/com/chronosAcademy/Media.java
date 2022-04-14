package br.com.chronosAcademy.automacaoWeb;

public class Media {

    public String calculaMedia(double nota1, double nota2) {
        double media = (nota1 + nota2)/2;
        if(media<5) {
            return ("Reprovado");
        }
        return ("Aprovado");
    }
}

