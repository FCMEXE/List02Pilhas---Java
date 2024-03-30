//        4) Escreva um programa em JAVA que cria 2 pilhas (N e P) e solicita ao usuário
//        para informar números inteiros para preencher um array. Para cada valor do
//        array:
//        se positivo, inserir na pilha P;
//        se negativo, inserir na pilha N;
//        se zero, retirar um elemento de cada pilha.
//        O array de números inteiros deve ter 8 elementos.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Ex04 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        Pilha p = new Pilha(8);
        Pilha n = new Pilha(8);
       ArrayList<Integer> arrayList = new ArrayList<>();
        int num = 0;

        for (int i = 0;i < 8;i++) {
            System.out.println("Digite um número até 8:");
            num = Scanner.nextInt();
            arrayList.add(num);
            if (num >= 0) {
                p.empilhar(num);
            } else {
                n.empilhar(num);
            }
        }
        System.out.println("Array de elementos:");
        System.out.println(arrayList);
        System.out.println("Pilha Positiva -> \n");
        p.ExibePilha();
        System.out.println("Pilha negativa -> \n");
        n.ExibePilha();





    }
}
