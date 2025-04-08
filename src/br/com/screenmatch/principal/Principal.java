package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração Filme: "+ meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //System.out.println(meuFilme.totalDeAvaliacoes);
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("Duração Filme: "+ outroFilme.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVizualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoVitorio = new Filme("Velozes e Furiosos - Desafio em Tokyo", 2006);
        filmeDoVitorio.setDuracaoEmMinutos(200);
        filmeDoVitorio.avalia(10);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filmeDoVitorio);
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        System.out.println("Tamanho da Lista " + listaFilmes.size());
        System.out.println("Primeiro filme " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println("toString do filme " + listaFilmes.get(0).toString());


    }
}