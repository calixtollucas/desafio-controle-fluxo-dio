import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o primeiro parâmetro: ");
        int param1 = in.nextInt();

        System.out.print("\nInsira o segundo parâmetro: ");
        int param2 = in.nextInt();

        try{

            if(param1 > param2) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            contar(param1, param2);

        } catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

    }

    public static void contar(int param1, int param2){
        int contagem = param2 - param1;

        for (int i = 1; i <= contagem; i++){
            System.out.printf("Imprimindo número %d\n", i);
        }
    }
}
