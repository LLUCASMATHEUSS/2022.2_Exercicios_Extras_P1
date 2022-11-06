import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args){
        Scanner escanear = new Scanner(System.in);
        System.out.println("Digite o primeiro número para a SOMA: ");
        int A = escanear.nextInt();
        System.out.println("Digite o segundo número para a SOMA: ");
        int B = escanear.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
