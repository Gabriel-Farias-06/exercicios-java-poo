package edu.gabriel.exerciciosbasico.exercicio02;

import java.util.Scanner;

public class Carro {
    private boolean ligado = false;
    private int marcha = 0;
    private int velocidade = 0;
    static Scanner sc = new Scanner(System.in);

    private void verificarDesligado() {
        if (this.velocidade == 0 && this.marcha == 0)
            this.ligado = false;
    }

    void ligarCarro() {
        this.ligado = true;
    }

    void desligarCarro() {
        this.ligado = false;
    }

    void acelerarVelo() {
        if (this.ligado && this.velocidade < 120 && this.marcha != 0) {
            switch (marcha) {
                case 1:
                    if (velocidade != 20) this.velocidade++; 
                    break;
                case 2:
                    if (velocidade != 40) this.velocidade++; 
                    break;
                case 3:
                    if (velocidade != 60) this.velocidade++; 
                    break;
                case 4:
                    if (velocidade != 80) this.velocidade++; 
                    break;
                case 5:
                    if (velocidade != 100) this.velocidade++; 
                    break;
                case 6:
                    if (velocidade != 120) this.velocidade++; 
                    break;
            }
        }
    }

    void diminuirVelo() {
        if (this.ligado && this.velocidade > 0) {
            switch (marcha) {
                case 1:
                    if (velocidade != 0) this.velocidade--; 
                    verificarDesligado();
                    break;
                case 2:
                    if (velocidade != 21) this.velocidade--; 
                    break;
                case 3:
                    if (velocidade != 41) this.velocidade--; 
                    break;
                case 4:
                    if (velocidade != 61) this.velocidade--; 
                    break;
                case 5:
                    if (velocidade != 81) this.velocidade--; 
                    break;
                case 6:
                    if (velocidade != 101) this.velocidade--; 
                    break;
            }
        }
    }

    void virarEsqDir() {
        if (this.ligado && this.velocidade >= 1 && this.velocidade <= 40)
            System.out.println("Carro virando");
        else
        System.out.println("Não é possível virar nessa velocidade");
    }

    void verificarVelo() {
        System.out.printf("Velocidade do carro: %d km/h\n", this.velocidade);
    }

    void trocarMarcha() {
    if(this.ligado) {
        System.out.print("Deseja aumentar(A) ou diminuir(D) a marcha? ");
        String novaMarcha = sc.next();
        if (novaMarcha.equals("A") && this.marcha < 6)
            this.marcha++;
        else if (novaMarcha.equals("D") && this.marcha > 0)
            this.marcha--;
        verificarDesligado();
        }   
    }
}
