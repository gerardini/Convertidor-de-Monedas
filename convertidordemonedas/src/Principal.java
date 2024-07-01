import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args)throws IOException {
        //variables para la clase dependencia
        Scanner teclado = new Scanner(System.in);
        Operacion consulta = new Operacion();


        //Variables para el menu

        String menu = """
                Bienvenido al conversor de monedas\n
                ****************************************************
                Elige la opcion deseada
                1.- Convertir peso argentino a dolar estadounidense.
                2.- Convertir dolar estadounidense a peso argentino.
                3.- Convertir real brasileño a dolar estadounidense.
                4.- Convertir dolar estadounidense a real brasileño.
                5.- Convertir peso colombiano a dolar estadounidense.
                6.- Convertir dolar estadounidense a peso colombiano.
                7.- Convertir peso mexicano a dolar estadounidense.
                8.- Convertir dolar estadounidense a peso mexicano.
                9.- Salir 
                *****************************************************
                """;

        //Inicio del programa
        int opcion = 0;


        while(opcion != 9 ){

                System.out.println(menu);
                System.out.println("Elija la operacion deseada");

               try {
                   opcion = teclado.nextInt();
                   teclado.nextLine();


                   switch (opcion) {
                       case 1:
                           ConvertirMoneda.convertir("ARS", "USD", consulta, teclado);
                           break;
                       case 2:
                           ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                           break;
                       case 3:
                           ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                           break;
                       case 4:
                           ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                           break;
                       case 5:
                           ConvertirMoneda.convertir("COP", "USD", consulta, teclado);
                           break;
                       case 6:
                           ConvertirMoneda.convertir("USD", "COP", consulta, teclado);
                           break;
                       case 7:
                           ConvertirMoneda.convertir("MXN", "USD", consulta, teclado);
                           break;
                       case 8:
                           ConvertirMoneda.convertir("USD", "MXN", consulta, teclado);
                           break;
                       case 9:
                           System.out.println("Terminando el programa...");
                           break;
                       default:
                           System.out.println("Opcion no valida");
                           break;
                   }
               }catch (InputMismatchException e){
                   System.out.println("Ingrese un numero del menu");
                   teclado.next();
                   opcion = 0;
               }catch (Exception e){
                   System.out.println("Opcion no valida");
                   break;
               }



        }
        teclado.close();




    }

}
