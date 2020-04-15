import java.util.Scanner;

public class EjecucionTaller2 {
    public static void main(String[] args) {
        System.out.println("bienvenidos al taller de algoritmos para el Sena");
        System.out.println("Ingrese de 1 a 5 para ver la solucion de cada punto");
        System.out.println("ingrese cualquier otro numero para terminar programa");
        Scanner sc = new Scanner(System.in);
        String optionLine = sc.nextLine();
        int option = Integer.parseInt(optionLine);//convirtiendo string a int para evitar errores
        while(option>0 && option<6){
            switch (option) {
                case 1:
                    System.out.println("ingrese el valor para la variable 1");
                    String a = sc.nextLine();//recibiendo valor tipo string
                    int aEntero = Integer.parseInt(a);//convirtiendo String en int para evitar errores
                    System.out.println("Ingrese el valor para la variable 2");
                    String b = sc.nextLine();//recibiendo datos
                    int bEntero = Integer.parseInt(b);//convirtiendo dato a entero
                    System.out.println("ingrese el valor para la variable 3");
                    String c = sc.nextLine();
                    int cEntero = Integer.parseInt(c);
                    EjercicioUno ejerUno = new EjercicioUno(aEntero, bEntero, cEntero);//mandando datos
                    ejerUno.sumaPrograma();//ejecucion de modulos del programa
                    ejerUno.multiplicacionPrograma();//ejecucion de modulos del programa
                    ejerUno.imprimirDatos();//ejecucion de modulos del programa
                    break;
                case 2:
                    System.out.println("ingrese el valor que desea determinar");
                    a = sc.nextLine();
                    aEntero = Integer.parseInt(a);
                    EjercicioDos ejerDos = new EjercicioDos(aEntero);//mandando datos
                    ejerDos.determinarNumero();
                    break;
                case 3:
                    System.out.println("ingrese el valor");
                    a = sc.nextLine();
                    aEntero = Integer.parseInt(a);//convirtiendo datos a entero
                    EjercicioTres ejerTres = new EjercicioTres(aEntero);//mandando datos
                    ejerTres.tablaMultiplicar();//ejecucion del metodo del programa
                    break;
                case 4:
                    System.out.println("ingrese el nombre del empleado");
                    String nombreEmpleado = sc.nextLine();
                    System.out.println("ingrese el salario del empleado");
                    String salarioEmpleado = sc.nextLine();
                    int salario = Integer.parseInt(salarioEmpleado);
                    System.out.println("ingrese el valor de las horas extras");
                    String valorHorasExtras = sc.nextLine();
                    int horasExtras = Integer.parseInt(valorHorasExtras);
                    System.out.println("ingrese el porcentaje de la comision");
                    String porcentajeEmpleado = sc.nextLine();
                    int comision = Integer.parseInt(porcentajeEmpleado);
                    LiquidarNomina liquidarEmpleado = new LiquidarNomina(nombreEmpleado, salario, horasExtras, comision);
                    liquidarEmpleado.calcularNomina();
                    liquidarEmpleado.imprimirDatos();
                    break;
                case 5:
                    //datos de entrada
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("ingrese el nombre del cliente");
                    String nombreCliente = sc.nextLine();
                    System.out.println("ingrese su genero");
                    String genero = sc.nextLine();
                    int madreEntero = 0;
                    System.out.println("ingrese su edad");
                    String edad = sc.nextLine();
                    int edadEntero = Integer.parseInt(edad);
                    int nino = 0;//variable global nino
                    //condicional mujeres
                    if(genero.equals("femenino") || genero.equals("mujer")){
                        System.out.println("si usted es madre introduzca 1 si no lo es introduzca 0");
                        String madre = sc.nextLine();
                        madreEntero = Integer.parseInt(madre);
                        if(madreEntero == 1){
                            System.out.println("ingrese la edad de su hijo");
                            String ninoLine = sc.nextLine();
                            nino = Integer.parseInt(ninoLine);
                        }
                    }
                    System.out.println("----------------------------------------------------------------------");
                    //registro de productos
                    System.out.println("ingrese el id del producto");
                    String idProducto = sc.nextLine();

                    //contador productos
                    int contadorProductos = 0;

                    contadorProductos++;
                    System.out.println("ingrese la fecha");
                    String fechaEntrada = sc.nextLine();//fecha para el cliente frecuente
                    System.out.println("ingrese el valor del producto");
                    String valorProducto = sc.nextLine();//valor de entrada tipo string
                    int valorProductoEntero = Integer.parseInt(valorProducto);//conversion string a entero para evitar errores
                    int contadorValor = 0;
                    contadorValor = contadorValor + valorProductoEntero;//suma de todos los products
                    System.out.println("-----------------------------------------------------------------------------");
                    do{
                        System.out.println("ingrese el id del producto o i para imprimir los datos");
                        idProducto = sc.nextLine();
                        if(idProducto.equals("i")){
                            TiendaTola tienda = new TiendaTola(nombreCliente, fechaEntrada, "", idProducto
                            , genero, contadorProductos, edadEntero, madreEntero, nino, contadorValor);
                            tienda.analisisDatos();
                            tienda.imprimirDatos();
                            break;
                        }
                        contadorProductos++;
                        System.out.println("ingrese la fecha");
                        String fechaCompra = sc.nextLine();//analizando la fecha 2 para cliente frecuente
                        System.out.println("ingrese el valor del producto");
                        valorProducto = sc.nextLine();
                        valorProductoEntero = Integer.parseInt(valorProducto);
                        contadorValor = contadorValor + valorProductoEntero;
                        System.out.println("-----------------------------------------------------------------------------");
                        System.out.println("ingrese el id del producto o i para imprimir los datos");
                        idProducto = sc.nextLine();
                        if(idProducto.equals("i")){
                            TiendaTola tienda = new TiendaTola(nombreCliente, fechaEntrada, fechaCompra, idProducto
                                    , genero, contadorProductos, edadEntero, madreEntero, nino, contadorValor);
                            tienda.analisisDatos();
                            tienda.imprimirDatos();
                            break;
                        }else
                        contadorProductos++;
                        System.out.println("ingrese la fecha");
                        fechaCompra = sc.nextLine();
                        System.out.println("ingrese el valor del producto");
                        valorProducto = sc.nextLine();
                        valorProductoEntero = Integer.parseInt(valorProducto);
                        contadorValor = contadorValor + valorProductoEntero;
                    }while (!idProducto.equals("i"));
                    break;
            }
            System.out.println("Ingrese de 1 a 5 para ver la solucion de cada punto");
            System.out.println("ingrese cualquier otro numero para terminar programa");
            optionLine = sc.nextLine();
            option = Integer.parseInt(optionLine);
        }

    }
}