import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args){
        Scanner escanear = new Scanner(System.in);
        System.out.println("Digite o primeiro número para a soma: ");
        int A = escanear.nextInt();
        System.out.println("Digite o segundo número para a soma: ");
        int B = escanear.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
    }
}
