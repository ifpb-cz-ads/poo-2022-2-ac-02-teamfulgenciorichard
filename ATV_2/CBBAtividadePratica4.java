/* Crie um programa que elabore o orçamento de uma construtora
para o cálculo do valor total de construção de uma piscina. O valor
total será dado pela cubagem da piscina (metros cúbicos) multiplicada por R$100,00,
que é o preço do metro cúbico construído de piscina. Faça a simulação dos cálculos no
programa para ver se está tudo funcionando corretamente */

import java.util.*;

public class CBBAtividadePratica4 {
    public static void main(String[] args){

        try (Scanner receptor = new Scanner(System.in)) {
            System.out.print("\nInsira o valor da cubagem: ");

            float cubagem = receptor.nextFloat();
            float precoMC = 100;

            float metroCubPreco = (cubagem * precoMC);

            System.out.println("\nO preço do metro cúbico é: " + metroCubPreco);
        }
        catch(InputMismatchException e){
            System.out.print("O valor informado não é um número!");
        }
    }
}
