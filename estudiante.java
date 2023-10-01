/**
 * Clase estudiante
 */
public class estudiante {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/
 private  String nombre;
private Date fechaDeNacimiento;
private double notaMateria1;
private double notaMateria2;
private double notaMateria3;

    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase estudiante: Inicializa los atributos de mi clase
     * @param String
     * @param Date
     * @param double((notaMateria1+notaMateria2+notaMateria3)/3);
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
   public Estudiante(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento; 
    }
public String getNombre() { 
        return nombre;
    }
    /**
     * Método de imprimir el nombre del estudiante
     * @return String: Imprime el nombre del estudiante
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    /**
     * Método que imprime la edad del estudiante
     *Primero solicita el año de nacimiento del estudiante y lo suma mas el año actual
     * @return boolean:Imprime la edad que tiene el estudiante según su año de nacimientos
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
 /**
     * Método para las 3 notas del estudiante
     *Primero solicita las 3 notas del estudiante para despues sacarle el promedio
     * @return double:toma las 3 notas del estudiante
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public double getnotaMateria1() {
        return notaMateria1;
    }

    public void setnotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public double getnotaMateria2() {
        return notaMateria2;
    }

    public void setnotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public double getnotaMateria3() {
        return notaMateria3;
    }

    public void setnotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    /******************** Método para la edad del estudiante ********************/
    /**
     * Método que calcula la edad actual del estudiante en años
     * @return La edad actual del estudiante en años
     */
    /**
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public int getEdad() {
        Date fechaActual = new Date();
        int edad = fechaActual.getAnio() - fechaDeNacimiento.getAnio();
        if (fechaDeNacimiento.getMes() > fechaActual.getMes() || 
           (fechaDeNacimiento.getMes() == fechaActual.getMes() && 
            fechaDeNacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }
      /******************** Método para el promedio del estudiante ********************/
    /**
     * Método que calcula el promedio del estudiante dependiendo de las 3 notas
     * @return El promedio
     */
    /**
     * Complejidad temporal: O(1) Tiempo Constante
     */
     public double promedioEstudiante(){
    return (notaMateria1 + notaMateria2 + notaMateria3) / 3;
    }
}
