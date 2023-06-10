package vista;

import javax.swing.JOptionPane;

import modelo.Pregunta;


public class JuegoVista {
    public int mostrarMenuDificultad() {
        String[] opciones = {"Fácil", "Intermedio", "Difícil"};
        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona la dificultad", "Cultura General",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        // Retornar el índice de la opción seleccionada
        return seleccion;
    }

    public int mostrarPregunta(Pregunta pregunta) {
        String[] opciones = pregunta.getOpciones();
        int seleccion = JOptionPane.showOptionDialog(null, pregunta.getEnunciado(), "Cultura General",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        // Retornar el índice de la opción seleccionada
        return seleccion;
    }

    public void mostrarResultado(int preguntasCorrectas, int totalPreguntas) {
        JOptionPane.showMessageDialog(null,
                "Preguntas correctas: " + preguntasCorrectas + "\nPreguntas incorrectas: " + (totalPreguntas - preguntasCorrectas),
                "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}

