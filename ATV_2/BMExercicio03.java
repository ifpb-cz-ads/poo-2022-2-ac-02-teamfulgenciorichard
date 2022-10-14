/* Crie um programa seguindo as orientações abaixo. Faça tudo que pede
dentro do método main.
a) Declare duas variáveis para armazenar os valores de dois itens de
venda. Os valores dos dois itens devem ser 2.95 e 3.50. Pense em nomes
significativos para as variáveis e também considere qual deve ser seu tipo.
b) Use o System.out.println() para mostrar o conteúdo de suas variáveis.
Execute o programa e veja a saída. Apresente uma mensagem significativa
como “O Item 1 custa 2.95 e ...” (Dica : utilize o operador + para
concatenar o texto com o valor da variável).
c) Declare uma outra variável para armazenar o custo total dos itens.
Utilize o operador de adição para realizar o cálculo e imprima o resultado.
d) Crie uma constante para armazenar a taxa de 8.25 % que deve ser
cobrada sobre o valor total. Armazene o cálculo numa variável chamada
taxaCalculada e imprima o resultado.
e) Adicione ao valor de cada item o valor da taxa calculado. Use a menor
linha de código possível para fazer isso. Some novamente os dois
valores e atribua o resultado a uma variável chamada novoCusto.
f) Crie uma variável booleana chamada muitoCaro. Escreva uma assertiva
lógica para setar essa variável para true se novoCusto for maior que
10 e para false, caso contrário. Imprima o valor obtido em muitoCaro.
(Não utilize if para escrever a assertiva.) */

public class BMExercicio03 {
    public static void main(String[] args){
        double pastel = 2.95;
        double cochinha = 3.50;
        System.out.println("\nConta\n\nCochinha: " + cochinha + "\nPastel: " + pastel + "\n");

        double vTotal = pastel+cochinha;
        System.out.println("Total: " + vTotal);

        final double taxaCalculada = 0.0825;
        System.out.println("Taxa: " + taxaCalculada*100 + "%\n");
        
        pastel += pastel * taxaCalculada;
        cochinha += cochinha* taxaCalculada;

        double novoCusto = pastel + cochinha;
        boolean muitoCaro = novoCusto > 10 ? true : false;
        System.out.println("Está Caro? " + (muitoCaro ? "Sim" : "Não"));
    }
}