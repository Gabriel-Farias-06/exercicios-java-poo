package edu.gabriel.exerciciosbasico.exercicio03;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BanhoPetshop banho = new BanhoPetshop();
    Scanner sc = new Scanner(System.in);
    int opcao = 0;
    do {
      System.out.print("Qual ação deseja realizar no seu banho? \n1- Dar banho no pet\n2- Abastecer com água\n3- Abastecer com shampoo\n4- Verificar nivel de água\n5- Verificar nivel de shampoo\n6 - Verificar se tem pet no banho\n7- Colocar pet na maquina\n8- Retirar pet da máquina\n9- Limpar maquina.\nDigite sua opção: ");
      opcao = sc.nextInt();
      switch (opcao) {
        case 1:
          banho.banharPet();
          break;
        case 2:
          banho.abastecerAgua();
          break;
        case 3:
          banho.abastecerShampoo();
          break;
        case 4:
          banho.verificarAgua();
          break;
        case 5:
          banho.verificarShampoo();
          break;
        case 6:
          banho.verificarPetBanho();
          break;
        case 7:
          banho.colocarPetMaquina();
          break;
        case 8:
          banho.retirarPetMaquina();
          break;
        case 9:
          banho.limparMaquina();
          break;
        default:
          System.out.println("Digite um valor válido!");
          break;
      }
    } while (opcao != 0);
    sc.close();
  }
}
