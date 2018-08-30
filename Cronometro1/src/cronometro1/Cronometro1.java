package cronometro1;
import cronometro1.Proceso;
import java.util.Scanner;
public class Cronometro1 {
    public static void main(String[] args) throws InterruptedException {
       Proceso p = new Proceso();
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite 1 para Contar hacia adelante");
       System.out.println("Digite 2 para Contar hacia atras");
       int a = sc.nextInt();
       switch (a){
            case 1: p.avanzar();break;
            case 2: p.retroceder();break;
            default :break;
        }
    }
}
