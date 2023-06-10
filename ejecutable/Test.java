package ejecutable;

import controlador.Controlador;
import modelo.JuegoModelo;
import vista.JuegoVista;

public class Test {
    public static void main(String[] args) {
        JuegoModelo modelo = new JuegoModelo();
        JuegoVista vista = new JuegoVista();
        Controlador controlador = new Controlador(modelo, vista);
        controlador.iniciarJuego();
    }
}

