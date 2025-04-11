package t4programacion.graficos;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Pantalla2Controller {

    @FXML
    private TextField tipoCalzado;
    @FXML
    private TextField talla;
    @FXML
    private TextField presio;

    public void volverAPantallaHello() throws IOException {

        HelloApplication.setRoot("hello-view");

    }

    public void guardar() {
        String tipo_calzado = tipoCalzado.getText();
        int talla_calzado = Integer.parseInt(talla.getText());
        double presio_calzado = Double.parseDouble(presio.getText());

        Calzado calzado = new Calzado(tipo_calzado, talla_calzado, presio_calzado);

        System.out.println("Calzado creado " + calzado.getTipo_calzado());

        tipoCalzado.clear();
        talla.clear();
        presio.clear();
    }
}
