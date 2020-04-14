public class EjercicioDos {
    //declaracion de variable
    private int a;
    //constructor que recibe los datos de la clase principal
    public EjercicioDos(int a) {
        this.a = a;
    }
    //metodos
    public void determinarNumero(){
        if(a>0){
            System.out.println("positivo");
        }else if(a<0){
            System.out.println("negativo");
        }else{
            System.out.println("nulo");
        }
    }
}

