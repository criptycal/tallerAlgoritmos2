import java.util.Scanner;//importando clase java para el scanner
public class TiendaTola {
    Scanner sc = new Scanner(System.in);//scanner para datos de entrada
    //variables
    private String nombreCliente, fechaEntrada, fechaCompra, idProducto, tipoCliente, edadClienteTola, genero;
    private int valorTotal, descuento, contadorProductos, valorDescuento, edadCliente, madre, nino;

    //constructor para recibir datos de la clase principal
    public TiendaTola(String nombreCliente, String fechaEntrada, String fechaCompra, String idProducto, String genero,
                       int contadorProductos, int edadCliente, int madre, int nino, int valorTotal) {
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaCompra = fechaCompra;
        this.idProducto = idProducto;
        this.edadClienteTola = edadClienteTola;
        this.genero = genero;
        this.contadorProductos = contadorProductos;
        this.edadCliente = edadCliente;
        this.madre = madre;
        this.nino = nino;
        this.valorTotal = valorTotal;
    }

    //metodos
    public void analisisDatos() {
        //cliente frecuente
        if (fechaCompra.equals(fechaEntrada) && contadorProductos >= 10) {
            descuento = 10;
            valorDescuento = descuento * valorTotal / 100;
            valorTotal = valorTotal - valorDescuento;
            tipoCliente = "Cliente Frecuente";
        } else if (edadCliente >= 70 && contadorProductos >= 3) {
            descuento = 25;
            valorDescuento = descuento * valorTotal / 100;
            valorTotal = valorTotal - valorDescuento;
            tipoCliente = "Cliente Social";
        } else if (genero.equals("mujer") || genero.equals("femenino") && edadCliente <= 40 && madre == 1 && nino <= 3) {
            descuento = 30;
            valorDescuento = descuento * valorTotal / 100;
            valorTotal = valorTotal - valorDescuento;
            tipoCliente = "Cliente gestante";
        } else {
            tipoCliente = "Cliente Normal";
            descuento = 20;
            valorDescuento = descuento * valorTotal / 100;
            valorTotal = valorTotal + valorDescuento;
        }

    }
    public void imprimirDatos(){
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Nombre del cliente es " + nombreCliente);
        System.out.println("Tu eres un " + tipoCliente);
        System.out.println("Total Productos " + contadorProductos);
        if(tipoCliente.equals("Cliente Normal")){
            System.out.println("no tiene descuento y debe pagar un iva de " + valorDescuento);
        }else {
            System.out.println("El descuento es " + valorDescuento);
        }
        System.out.println("el valor total es " + valorTotal);
        System.out.println("-----------------------------------------------------------------------------------");
    }
}
