public class EjercicioTres {
    //declaracion de variables
    private int a,r;
    //constructor para recibir datos de la clase principal
    public EjercicioTres(int a) {
        this.a = a;
    }
    //metodos
    public void tablaMultiplicar(){
        for (int i = 1; i <= 10; i++){
            r = a * i;
            System.out.println(a + " X " + i + " = " + r);
        }

    }
}
