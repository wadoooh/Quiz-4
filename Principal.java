/**
 * Primera clase que se ejecuta
 */
public class Principal {

    /**
     * Primer método que se ejecuta en mi clase principal
     * @param args
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        Estudiante miEstudiante = new Estudiante(Juan Carlos, 17 años, su promedio es 4.6);
        miEstudiante.NombreEstudiante();
        miEstudiante.edadEstudiante();
        miEstudiante.promedioEstudiante();
    }
}
