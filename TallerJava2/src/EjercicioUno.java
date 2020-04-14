import java.util.Scanner;

public class EjercicioUno {
    //Declaracion de variables y constantes
    private int a , b, c, r;
    //constructor que recibe los datos de la clase principal
    public EjercicioUno(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //metodos
    public int sumaPrograma(){
        r = a+b+c;
        return r;
    }
    public int multiplicacionPrograma(){
        r = a*b*c;
        return r;
    }
    public void imprimirDatos(){
        System.out.println("suma " + sumaPrograma());
        System.out.println("multiplicacion " + multiplicacionPrograma());
    }

}
