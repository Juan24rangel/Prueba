package controlador;
import modelo.JuegoModelo;
import modelo.Pregunta;
import vista.JuegoVista;

public class Controlador {
    private JuegoModelo modelo;
    private JuegoVista vista;

    public Controlador(JuegoModelo modelo, JuegoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarJuego() {
        int dificultad = vista.mostrarMenuDificultad();
        int totalPreguntas = 0;
        int preguntasCorrectas = 0;
        int preguntasIncorrectas = 0;

        switch (dificultad) {
            case 0:
                totalPreguntas = 10;
                break;
            case 1:
                totalPreguntas = 15;
                break;
            case 2:
                totalPreguntas = 20;
                break;
        }

        for (int i = 0; i < totalPreguntas; i++) {
            Pregunta pregunta = modelo.getPregunta(i);
            int seleccion = vista.mostrarPregunta(pregunta);

            if (seleccion == pregunta.getRespuestaCorrecta()) {
                preguntasCorrectas++;
            } else {
                preguntasIncorrectas++;
            }
        }

        vista.mostrarResultado(preguntasCorrectas, preguntasIncorrectas);
    }
}
