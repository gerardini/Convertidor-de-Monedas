import java.io.IOException;
import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir(String monedaBase, String monedaTarjet, Operacion consulta, Scanner teclado){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarjet);
        System.out.println("Tipo de Cambio al dia de hoy \n "+monedaBase+ " = "+monedas.conversion_rate()+" "+monedaTarjet);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" "+cantidadConvertida+ " " + monedas.target_code());
        GeneradorDeArchivo generador = new GeneradorDeArchivo();
        try {
            generador.guardarJson(monedas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
