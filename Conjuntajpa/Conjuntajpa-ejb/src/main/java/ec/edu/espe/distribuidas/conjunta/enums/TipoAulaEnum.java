/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjuntajpa-ejb
 * 
 * Creado: 10/12/2019 - 20:58:38
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.conjunta.enums;

/**
 *
 * Hace referencia a los Standard Checks de la columna TIPO en la tabla
 * ADM_AULA.
 *
 * @author Kevin Israel
 */
public enum TipoAulaEnum {
    /**
     * Representa al valor Cliente.
     */
    TI1("Tipo 1"),
    /**
     * Representa al valor Empresa.
     */
    TI2("Tipo 2"),
    /**
     * Representa al valor Final.
     */
    TI3("Tipo 3");

    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private TipoAulaEnum(String text) {
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
