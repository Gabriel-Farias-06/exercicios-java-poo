package edu.gabriel.exerciciosbasico.exercicio01;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ContaBancaria pessoa = new ContaBancaria(500);
    int opcao = 0;
    do {
      System.out.print("Qual ação deseja realizar na sua conta? \n1- Consultar saldo\n2- Consultar cheque especial\n3- Depositar dinheiro\n4- Sacar dinheiro\n5- Pagar um boleto\n6- Verificar se a conta está usando cheque especial\nDigite sua opção: ");
      opcao = sc.nextInt();
      switch (opcao) {
        case 1:
          pessoa.consultarSaldo();
          break;
        case 2:
          pessoa.consultarCheque();
          break;
        case 3:
          pessoa.depositar();
          break;
        case 4:
          pessoa.sacar();
          break;
        case 5:
          pessoa.pagarBoleto();
          break;
        case 6:
          pessoa.verificarUsoCheque();
          break;
        default:
          System.out.println("Digite um valor válido!");
          break;
      }
    } while (opcao != 0);
    sc.close();
  }
}
