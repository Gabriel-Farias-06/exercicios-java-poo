package edu.gabriel.exerciciosbasico.exercicio03;

public class BanhoPetshop {
    int agua = 0, shampoo = 0;
    boolean ocupado = false;
    void banharPet(Pet pet) {
        if(!ocupado && agua >= 10 && shampoo >= 2) {
            this.ocupado = true;
            this.agua -= 10;
            this.shampoo -= 2;
        }
    }
}
