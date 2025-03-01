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
    }

    void abastecerAgua() {
        if (this.agua < 29)
            this.agua += 2;
    }

    void abastecerShampoo() {
        if (this.shampoo < 9)
            this.shampoo += 2;
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
        }
    }

    void retirarPetMaquina() {
        if (this.petMaquina) {
            this.petMaquina = false;
        }

        if (!this.petAtualLimpo)
            this.maquinaLimpa = false;
    }

    void limparMaquina() {
        if (this.agua >= 3 && this.shampoo >= 1 && !this.maquinaLimpa)
            this.maquinaLimpa = true;
    }
}
