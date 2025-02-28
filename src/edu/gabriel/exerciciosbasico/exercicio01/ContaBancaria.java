package edu.gabriel.exerciciosbasico.exercicio01;
import java.util.Scanner;

public class ContaBancaria {
  private double saldo;
  private double chequeEspecial;
  private boolean chequeUsado = false;
  final Scanner sc = new Scanner(System.in);

  ContaBancaria(double saldo) {
    this.saldo = saldo;
    definirCheque();
  }

  private void definirCheque() {
    if (this.saldo <= 500)
      this.chequeEspecial = 50.00;
    else
      this.chequeEspecial = saldo * 0.5;
  }

  void consultarSaldo() {
    System.out.println("O saldo da conta é de R$ " + this.saldo);
  }

  void consultarCheque() {
    System.out.println("O valor do cheque especial disponível da conta é de R$ " + this.saldo);
  }

  void depositar() {
    System.out.print("Digite a quantia a ser depositada: ");
    this.saldo += sc.nextDouble();
  }

  private void retirarDinheiro(double valorSaque) {
    if (valorSaque > this.saldo) {
      System.out.print("Saldo da conta insuficiente, deseja utlilizar o cheque especial? (S/N) ");
      boolean utlilizarCheque = sc.next() == "N"? false : true;
      if (utlilizarCheque) {
        if(valorSaque - this.saldo > this.chequeEspecial)
          System.out.println("Cheque especial insuficiente para operação!");
        else 
          this.chequeEspecial = valorSaque - this.saldo;
      }
    }
    else
      this.saldo -= valorSaque;
  }

  void sacar() {
    System.out.print("Digite a quantia a ser sacada: ");
    double valorSaque = sc.nextDouble();
    retirarDinheiro(valorSaque); 
  }

  void pagarBoleto() {
    System.out.print("Digite o valor da fatura a ser paga: ");
    double valorSaque = sc.nextDouble();
    retirarDinheiro(valorSaque); 
  }

  void verificarUsoCheque() {
    if (chequeUsado)
      System.out.println("O cheque especial está sendo utilizado");
    else
      System.out.println("O cheque especial não foi utilizado");
  }

}
