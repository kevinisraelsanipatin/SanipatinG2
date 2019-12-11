package ec.edu.espe.distribuidas.conjunta.enums;

/**
 *
 * Hace referencia a los Standard Checks de la columna ESTADO en la tabla
 * ADM_ASIGNATURA_PARALELO.
 *
 * @author Kevin Israel
 */
public enum EstadoAsignaturaParaleloEnum {
    /**
     * Representa al valor Estado 1.
     */
    ES1("Estado 1"),
    /**
     * Representa al valor Estado 2.
     */
    ES2("Estado 2"),
    /**
     * Representa al valor Estado 3.
     */
    ES3("Estado 3");

    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private EstadoAsignaturaParaleloEnum(String text) {
        this.text = text;
    }

    /**
     * Retorna el texto asociadado al elemento de la enumeraci\u00F3n.
     *
     * @return Texto asociado al elemento de la enumeraci\u00F3n.
     */
    public String getText() {
        return this.text;
    }
}
