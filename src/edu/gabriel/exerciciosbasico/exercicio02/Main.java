package edu.gabriel.exerciciosbasico.exercicio02;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro();
    Scanner sc = new Scanner(System.in);
    int opcao = 0;
    do {
      System.out.print("Qual ação deseja realizar no seu carro? \n1- Ligar carro\n2- Desligar carro\n3- Acelerar velocidade\n4- Diminuir velocidade\n5- Virar para esquerda/direita\n6- Verificar velocidade\n7- Trocar a marcha\nDigite sua opção: ");
      opcao = sc.nextInt();
      switch (opcao) {
        case 1:
          carro.ligarCarro();
          break;
        case 2:
          carro.desligarCarro();
          break;
        case 3:
          carro.acelerarVelo();
          break;
        case 4:
          carro.diminuirVelo();
          break;
        case 5:
          carro.virarEsqDir();
          break;
        case 6:
          carro.verificarVelo();
          break;
        case 7:
          carro.trocarMarcha();
          break;
        default:
          System.out.println("Digite um valor válido!");
          break;
      }
    } while (opcao != 0);
    sc.close();
  }
}
