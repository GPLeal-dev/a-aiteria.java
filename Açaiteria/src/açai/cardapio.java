package açai;

import java.util.Scanner;

public class cardapio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo(a) à açaiteria do Gabriel");
        System.out.println("-----------CARDAPIO-----------");
        System.out.println("|TAMANHOS | CUPAÇU(CP) | AÇAI(AC)");
        System.out.println("   P      |  R$ 9.00   |  R$11.00");
        System.out.println("   M      |  R$ 14.00  |  R$16.00");
        System.out.println("   G      |  R$ 18.00  |  R$20.00");

        double totalPedido = 0;

        while (true) {

            String sabor;

            while (true) {
                System.out.print("Digite o sabor desejado CP pra Cupuaçu ou AC para Açai: ");
                sabor = sc.nextLine().toUpperCase();

                if (sabor.equals("CP") || sabor.equals("AC")) {
                    break;
                } else {
                    System.out.println("Sabor invalido. Tente novamente");
                }
            }

            String tamanho;

            while (true) {
                System.out.print("Digite o tamanho desejado (P, M ou G): ");
                tamanho = sc.nextLine().toUpperCase();

                if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) {
                    break;
                } else {
                    System.out.println("Tamanho invalido. Tente novamente.");
                }
            }

            double preco = 0;

            if (sabor.equals("CP")) {
                preco = Cupacu.getPreco(tamanho);
            } else {
                preco = Acai.getPreco(tamanho);
            }

            totalPedido += preco;

            System.out.printf("Você pediu %s tamanho %s no valor de R$ %.2f\n",
                    sabor, tamanho, preco);

            System.out.print("Deseja pedir mais alguma coisa? (S/N): ");
            String mais = sc.nextLine().toUpperCase();

            if (!mais.equals("S")) {
                break;
            }
        }

        System.out.printf("\nO valor total do seu pedido é: R$ %.2f\n", totalPedido);

        sc.close();
    }
}
