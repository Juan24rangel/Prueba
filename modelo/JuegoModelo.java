package modelo;

import java.util.ArrayList;
import java.util.List;


public class JuegoModelo {
    private List<Pregunta> preguntas;
    private int preguntasCorrectas;

    public JuegoModelo() {
        preguntas = new ArrayList<>();
        preguntasCorrectas = 0;

        preguntas.add(new Pregunta("¿Cuál es la capital de Francia?",
        new String[]{"París", "Londres", "Roma"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el río más largo del mundo?",
        new String[]{"Amazonas", "Nilo", "Yangtsé"}, 0));
        preguntas.add(new Pregunta("¿En qué continente se encuentra el desierto del Sahara?",
        new String[]{"África", "Asia", "América"}, 0));
        preguntas.add(new Pregunta("¿Cuál es la montaña más alta del mundo?",
        new String[]{"Monte Everest", "Monte Kilimanjaro", "Monte Aconcagua"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el océano más grande del mundo?",
        new String[]{"Océano Pacífico", "Océano Atlántico", "Océano Índico"}, 0));
        preguntas.add(new Pregunta("¿Quién pintó la Mona Lisa?",
        new String[]{"Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el metal más abundante en la corteza terrestre?",
        new String[]{"Aluminio", "Hierro", "Cobre"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el planeta más grande del sistema solar?",
        new String[]{"Júpiter", "Saturno", "Neptuno"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el país más poblado del mundo?",
        new String[]{"China", "India", "Estados Unidos"}, 0));
        preguntas.add(new Pregunta("¿Quién escribió la obra Romeo y Julieta?",
        new String[]{"William Shakespeare", "Miguel de Cervantes", "Friedrich Nietzsche"}, 0));
        preguntas.add(new Pregunta("¿Cuál es la moneda oficial de Japón?",
        new String[]{"Yen", "Won", "Dólar"}, 0));
        preguntas.add(new Pregunta("¿En qué año comenzó la Segunda Guerra Mundial?",
        new String[]{"1939", "1945", "1914"}, 0));
        preguntas.add(new Pregunta("¿Cuál es la capital de Australia?",
        new String[]{"Canberra", "Sídney", "Melbourne"}, 0));
        preguntas.add(new Pregunta("¿Quién escribió el libro Don Quijote de la Mancha?",
        new String[]{"Miguel de Cervantes", "Gabriel García Márquez", "Federico García Lorca"}, 0));
        preguntas.add(new Pregunta("¿Cuál es la lengua más hablada del mundo?",
        new String[]{"Chino mandarín", "Español", "Inglés"}, 0));
        preguntas.add(new Pregunta("¿Cuál es la fórmula química del agua?",
        new String[]{"H2O", "CO2", "NaCl"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el país más grande en superficie del mundo?",
        new String[]{"Rusia", "Canadá", "China"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el instrumento musical de viento más antiguo?",
        new String[]{"Flauta", "Trompeta", "Saxofón"}, 0));
        preguntas.add(new Pregunta("¿En qué año se fundó la empresa Apple?",
        new String[]{"1976", "1984", "1991"}, 0));
        preguntas.add(new Pregunta("¿Cuál es el compuesto químico del dióxido de carbono?",
        new String[]{"CO2", "H2O", "NaCl"}, 0));
        
    }
    

    public int getCantidadPreguntas() {
        return preguntas.size();
    }

    public Pregunta getPregunta(int indice) {
        return preguntas.get(indice);
    }

    public void aumentarPreguntasCorrectas() {
        preguntasCorrectas++;
    }

    public int getPreguntasCorrectas() {
        return preguntasCorrectas;
    }
}
