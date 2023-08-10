package com.trybe.acc.java.planejamentodeviagem;

public class Voo {

  private int tempoVoo;

  /**
   * Método para retornar tempo de Voo.
   */
  public int retornarTempoVoo(double distanciaKm) {
    double duracaoDouble = distanciaKm / 700.0;
    return (int) duracaoDouble;
  }

  /**
   * Método para retornar informaçao do Voo.
   */
  public String retornarInformacaoVoo(String embarque, String origem, String desembarque,
      String destino) {

    return "Partida: " + embarque + "\n"
        + "Origem: " + origem + "\n \n"
        + "Chegada: " + desembarque + "\n"
        + "Destino: " + destino + "\n \n";
  }
}
