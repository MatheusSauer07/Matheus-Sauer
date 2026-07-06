import java.util.Scanner;

public class Uni5Ex1 {
    public static void main(String[] args)  {
        
        Scanner leitor = new Scanner (System.in);
        
        int repetições = 1;

        for (repetições = 1; repetições <= 20; repetições++) {
            System.out.print("Escreva números inteiros para verificar impar ou par (20 vezes): ");
        int numero = leitor.nextInt();

        if ((numero % 2)==0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        }
        leitor.close();
    }
}
