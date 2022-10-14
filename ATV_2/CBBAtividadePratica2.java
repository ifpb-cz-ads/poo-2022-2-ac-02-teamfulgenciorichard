/* Crie um programa e declare nele 3 variáveis numéricas int, 
inicializando-as com algum valor e obtenha a soma dessas variáveis 
e a média delas, imprimindo esses resultados na tela. */

public class CBBAtividadePratica2 {
    public static void main(String[] args){
        
        int valor1 = 10;
        int valor2 = 5;
        int valor3 = 26;

        Integer soma = (valor1+valor2+valor3);
        float media = (soma.floatValue()) / 3;

        System.out.println("A soma é : " + soma);
        System.out.println("A média é: " + media);
    }
}
