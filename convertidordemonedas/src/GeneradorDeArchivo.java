import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeneradorDeArchivo {
    public void guardarJson(Monedas monedas) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter teclado = new FileWriter(monedas.base_code()+".json");
        teclado.write(gson.toJson(monedas));
        teclado.close();

    }
}
