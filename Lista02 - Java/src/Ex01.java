//         1) Escreva um programa em JAVA que leia números inteiros e armazene em
//        uma pilha. A entrada de dados deve ser interrompida quando o usuário
//        informar o número zero e/ou esgotar a quantidade definida de elementos a
//        serem armazenados na estrutura. Por último, imprima os elementos na
//        ordem em que foram removidos da pilha.


import java.util.Objects;
import java.util.Scanner;

public class Ex01   {
    public static void main(String[] args) {

        Pilha pilha = new Pilha(5);
        Scanner Scanner = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Add Pilha:");
            num = Scanner.nextInt();
           if (num !=0) {
               pilha.empilhar(num);
           }
        } while (num != 0 && pilha.cheia() == false );


    pilha.ExibePilha();
    }
}