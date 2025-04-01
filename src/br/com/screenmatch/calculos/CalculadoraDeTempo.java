package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

import java.sql.SQLOutput;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }

    public void inclui (Titulo titulo){
        System.out.println("Adicionando duração em minutos de "+titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
