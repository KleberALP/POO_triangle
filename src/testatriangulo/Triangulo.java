package testatriangulo;

public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double x,double y,double z){
    this.lado1 = x;
    this.lado2 = y;
    this.lado3 = z;
    }
    
    
    public boolean ValidaLados(Triangulo tri){
        if (tri.lado1 < tri.lado2+tri.lado3 || tri.lado2 < tri.lado1+tri.lado3 || tri.lado3<tri.lado1+tri.lado2){
            return true;
        }
        return false;
            
    }
    
    public String ClassificaTriangulo(Triangulo x){
        if (x.lado1 == x.lado2 && x.lado1 ==x.lado3){
            return "Equilatero";
        }else if(x.lado1 == x.lado2 || x.lado1 ==x.lado3){
            return "Isosceles";
        }else{
            return "Escaleno";
        }
    }
    
    public double CalculaArea( Triangulo t1 ){
        double x = (t1.lado1+t1.lado2+t1.lado3)/2;
        
        return Math.pow(x*(x-t1.lado1)*(x-t1.lado2)*(x-t1.lado3), 0.5);
    }
    
    public double CalculaPerimetro (Triangulo t1){
        return t1.lado1+t1.lado2+t1.lado3;
    }
    
    
    
}



