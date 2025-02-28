package edu.gabriel.exerciciosbasico.exercicio01;
public class Main {
  public static void main(String[] args) {
    
    ContaBancaria ana = new ContaBancaria(500);
    ana.depositar();
    ana.consultarSaldo();
    ana.consultarCheque();
  }
}
