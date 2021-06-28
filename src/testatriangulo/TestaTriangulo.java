package testatriangulo;
import java.util.Scanner;

public class TestaTriangulo {

    public static void main(String[] args) {
        Triangulo t1;
        Scanner entrada = new Scanner(System.in);
        double a,b,c;
        int continua = 1;
        
        while (continua != 0){
            System.out.println("\nDigite um valor para o primeiro lado: ");
            a = entrada.nextDouble();
            System.out.println("Digite um valor para o segundo lado: ");
            b= entrada.nextDouble();
            System.out.println("Digite um valor para o terceiro lado: ");
            c=entrada.nextDouble();
            t1 = new Triangulo(a,b,c);
            
            if(t1.ValidaLados(t1) == true){
                System.out.println("Lados formam um triangulo");
            }else{
                System.out.println("Lados nao formam um triangulo");
            }
            System.out.println(t1.ClassificaTriangulo(t1));
            System.out.printf("Área do triangulo: %2f", t1.CalculaArea(t1));
            System.out.printf("\nPerímeto do Triangulo: %2f",t1.CalculaPerimetro(t1));
            
            System.out.println("\nDeseja parar de validar triangulos? Se sim, digite 0! ");
            continua=entrada.nextInt();
        }
        
       
    }
    
}
