public class LiquidarNomina {
    //variables
    private String nombreEmpleado;
    private int salario, valorHorasExtras, comision, neto;
    //constructor, datos de entrada
    public LiquidarNomina(String nombreEmpleado, int salario, int valorHorasExtras, int comision) {
        this.nombreEmpleado = nombreEmpleado;
        this.salario = salario;
        this.valorHorasExtras = valorHorasExtras;
        this.comision = comision;
    }
    //metodo
    public int calcularNomina (){
        int valorComision = comision * salario / 100;
        neto = salario + valorHorasExtras + valorComision;
        return neto;
    }
    public void imprimirDatos(){
        System.out.println(nombreEmpleado + " tiene un salario neto de " + neto);
    }
}
