package edu.gabriel.exerciciosbasico.exercicio01;
import java.util.Scanner;

public class ContaBancaria {
  private double saldo;
  private double chequeEspecial;
  private boolean chequeUsado = false;
  private double valorChequeUsado;
  static Scanner sc = new Scanner(System.in);

  ContaBancaria(double saldo) {
    this.saldo = saldo;
    definirCheque();
  }

  void pagarChequeEspecial() {
    double valorCobrar = this.valorChequeUsado + (this.valorChequeUsado * 0.2);
    if (this.chequeUsado && valorCobrar <= this.saldo) {
      this.saldo -= valorCobrar;
      this.chequeUsado = false;
      System.out.println("Dinheiro retirado da conta devido a uso do cheque especial!");
    }

  }

  private void definirCheque() {
    if (this.saldo <= 500)
      this.chequeEspecial = 50.00;
    else
      this.chequeEspecial = saldo * 0.5;
  }

  void consultarSaldo() {
    pagarChequeEspecial();
    System.out.println("O saldo da conta é de R$ " + this.saldo);
  }

  void consultarCheque() {
    pagarChequeEspecial();
    System.out.println("O valor do cheque especial disponível da conta é de R$ " + this.chequeEspecial);
  }

  void depositar() {
    pagarChequeEspecial();
    System.out.print("Digite a quantia a ser depositada: ");
    this.saldo += sc.nextDouble();
  }

  private void retirarDinheiro(double valorSaque) {
    if (valorSaque > this.saldo) {
      System.out.print("Saldo da conta insuficiente, deseja utlilizar o cheque especial? (S/N) ");
      boolean utlilizarCheque = sc.next() == "N"? false : true;
      if (utlilizarCheque) {
        if((valorSaque - this.saldo) > this.chequeEspecial)
          System.out.println("Cheque especial insuficiente para operação!");
        else {
          this.valorChequeUsado = valorSaque - this.saldo;
          this.chequeEspecial -= (valorSaque - this.saldo);
          this.saldo = 0;
          this.chequeUsado = true;
        }
      }
    }
    else
      this.saldo -= valorSaque;
  }

  void sacar() {
    pagarChequeEspecial();
    System.out.print("Digite a quantia a ser sacada: ");
    double valorSaque = sc.nextDouble();
    retirarDinheiro(valorSaque); 
  }

  void pagarBoleto() {
    pagarChequeEspecial();
    System.out.print("Digite o valor da fatura a ser paga: ");
    double valorSaque = sc.nextDouble();
    retirarDinheiro(valorSaque); 
  }

  void verificarUsoCheque() {
    pagarChequeEspecial();
    if (this.chequeEspecial == 0)
      System.out.println("O cheque especial já foi utilizado");
    else
      System.out.println("O cheque especial não foi utilizado por completo");
  }

}
