package edu.gabriel.exerciciosbasico.exercicio03;

public class Main {
  public static void main(String[] args) {
    BanhoPetshop banho = new BanhoPetshop();
    banho.abastecerAgua();
    banho.abastecerAgua();
    banho.verificarAgua();
    banho.abastecerAgua();
    banho.abastecerShampoo();
    banho.verificarShampoo();
    banho.abastecerShampoo();
    banho.abastecerShampoo();
    banho.banharPet();
    banho.colocarPetMaquina();
    banho.banharPet();
    banho.retirarPetMaquina();
    banho.colocarPetMaquina();
    banho.retirarPetMaquina();
    banho.limparMaquina();
    banho.verificarPetBanho();
  }
}
