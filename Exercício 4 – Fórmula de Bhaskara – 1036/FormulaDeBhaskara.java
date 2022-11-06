import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args){
        Scanner escanear = new Scanner(System.in);
        System.out.println("Digite o primeiro número da equação quadrática : ");
        double A = escanear.nextDouble();
        System.out.println("Digite o segundo número da equação quadrática  : ");
        double B = escanear.nextDouble();
        System.out.println("Digite o teceiro número da equação quadrática : ");
        double C = escanear.nextDouble();
        double delta = B*B-4*A*C;
        double R1 = ((-B+Math.sqrt(delta))/(2*A));
        double R2 = ((-B-Math.sqrt(delta))/(2*A)); 
        
        if(delta < 0 | A == 0){
            System.out.println("Impossivel Calcular");
        }
        else{
            System.out.println("R1 = " + String.format("%.5f", R1));
            System.out.println("R2 = " + String.format("%.5f", R2));
        }
    }
}