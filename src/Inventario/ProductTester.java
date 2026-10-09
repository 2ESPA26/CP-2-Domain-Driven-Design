package Inventario;

import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maxSize;

        do {
            System.out.println("Insira o número de produtos que gostaria de adicionar:");
            System.out.println("Digite 0 se não quiser adicionar mais produtos:");

            maxSize = scan.nextInt();

            if (maxSize < 0) {
                System.out.println("Valor incorreto inserido");
            }

        } while (maxSize < 0);

        if (maxSize == 0) {

            System.out.println("Não há produtos!");

        } else {

            Produto[] Produtos = new Produto[maxSize];

            for (int i = 0; i < maxSize; i++) {

                scan.nextLine();

                System.out.println("Insira o nome do produto:");
                String tempName = scan.nextLine();

                System.out.println("Insira o número do produto:");
                int tempNumber = scan.nextInt();

                System.out.println("Insira a quantidade desse produto:");
                int tempQty = scan.nextInt();

                System.out.println("Insira o valor do produto:");
                float tempPrice = scan.nextFloat();

                Produtos[i] = new Produto(
                        tempNumber,
                        tempName,
                        tempQty,
                        tempPrice
                );
            }

            System.out.println("\nProdutos cadastrados:\n");

            for (Produto produto : Produtos) {
                System.out.println(produto);
                System.out.println();
            }
        }

        scan.close();
    }
}