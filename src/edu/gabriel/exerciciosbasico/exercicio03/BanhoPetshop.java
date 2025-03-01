package edu.gabriel.exerciciosbasico.exercicio03;

public class BanhoPetshop {
    private int agua = 0, shampoo = 0;
    private boolean petMaquina = false, maquinaLimpa = true, petAtualLimpo = false;
    void banharPet() {
        if(this.petMaquina && agua >= 10 && shampoo >= 2) {
            this.agua -= 10;
            this.shampoo -= 2;
            this.petAtualLimpo = true;
        }
        else
            System.out.println("Não foi possível banhar o pet");
    }

    void abastecerAgua() {
        if (this.agua < 29){
            this.agua += 2;
            System.out.println("Água abastecida com sucesso");
        }
        else
        System.out.println("Máquina cheia demais para abastecer");
    }

    void abastecerShampoo() {
        if (this.shampoo < 9){
            this.shampoo += 2;
            System.out.println("Shampoo abastecido com sucesso");
        }
        else
        System.out.println("Máquina cheia demais para abastecer");
    }

    void verificarAgua() {
        System.out.println("Água na máquina: " + this.agua + "l");
    }

    void verificarShampoo() {
        System.out.println("Shampoo na máquina: " + this.shampoo + "l");
    }

    void verificarPetBanho() {
        System.out.println("Pet no banho: " + (this.petMaquina ? "Sim" : "Não"));
    }

    void colocarPetMaquina() {
        if (!this.petMaquina && this.maquinaLimpa) {
            this.petMaquina = true;
            System.out.println("Adicionado novo pet na máquina");
        }
        else
            System.out.println("Não foi possível colocar um novo pet na máquina!");
    }

    void retirarPetMaquina() {
        if (this.petMaquina) {
            this.petMaquina = false;
            System.out.println("Pet retirado da máquina");
        }
        else
        System.out.println("A máquina está vazia");

        if (!this.petAtualLimpo)
            this.maquinaLimpa = false;
    }

    void limparMaquina() {
        if (this.agua >= 3 && this.shampoo >= 1 && !this.maquinaLimpa) {
            System.out.println("A máquina está limpa");
            this.maquinaLimpa = true;
        }
        else
            System.out.println("Não foi possível limpar a máquina");
    }
}
