//         2) Construa um programa em JAVA utilizando uma pilha que resolva o
//        seguinte problema:
//        Armazene as placas dos carros que estão estacionados numa rua sem saída
//        estreita. Dado uma placa verifique se o carro está estacionado na rua. Caso
//        esteja, informe a sequência de carros que deverá ser retirada para que o carro
//        em questão consiga sair.


import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        Scanner Scanner = new Scanner(System.in);
        String placa;
        String SelectPlate;


        // create a plates for cars
        do {
            System.out.println("Digite a Placa do seu carro: \n");
            placa = Scanner.nextLine();
            pilha.empilhar(placa);
            pilha.ExibePilha();
        } while (pilha.cheia() == false);


        // loop for search plate
        boolean plateFound = false;
        System.out.println("Write your car license plate:");
        SelectPlate = Scanner.nextLine();
        String Path = "";

        while (!pilha.vazia()) {
            String plate = (String) pilha.desempilhar();
            Path += plate + "->";
            if (plate.equals(SelectPlate)) {
                plateFound = true;
                break;
            }
        }

        // Check plate
        if (plateFound) {
            System.out.println("Placa encontrada!");
            System.out.println("Caminho percorrido até encontrar a placa: " + Path);
        } else {
            System.out.println("Placa não encontrada!");
        }
    }
}
