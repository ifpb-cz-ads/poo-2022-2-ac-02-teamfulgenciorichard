/* Declare uma variável chamada long1 do tipo long e a inicialize com 100.
Agora declare duas variáveis do tipo int, int1 e int2, e inicialize int1 com
200. Agora faça int2 receber int1 mais long1 e explique os resultados.
Arrume o código para que não ocorra o erro anterior. */

public class BMExercicio04 {
    public static void main(String[] args){
        long long1 = 100;
        int int1 = 200;

        //int int2 = long1 + int1;
        //NÃO É POSSÍVEL CONVERTER LONG PARA INT, POR MAIS QUE SEJAM INTEIROS, UM É DE 32 BITS E OUTRO DE 64 BITS, ENTÃO DÁ ERRO;

        int int2 = (int) (long1 + int1);
        //AGORA SIM É POSSÍVEL POIS ESTÁ EXPLÍCITO QUE QUERO RECEBER O VALOR COMO 32 BITS ASSIM COMO A VARIÁVEL DECLARADA int2;
        System.out.println("valor de int2 = " + int2);
    }
}
