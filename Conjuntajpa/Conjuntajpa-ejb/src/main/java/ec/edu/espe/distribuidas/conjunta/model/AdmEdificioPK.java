/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjuntajpa-ejb
 * 
 * Creado: 10/12/2019 - 20:58:39
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.conjunta.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Kevin Israel
 */
@Embeddable
class AdmEdificioPK implements Serializable {

    @Column(name = "COD_SEDE", nullable = false, length = 10)
    private String codSede;

    @Column(name = "COD_EDIFICIO", nullable = false, length = 10)
    private String codEdificio;

    public AdmEdificioPK() {
    }

    public AdmEdificioPK(String codSede, String codEdificio) {
        this.codSede = codSede;
        this.codEdificio = codEdificio;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public String getCodEdificio() {
        return codEdificio;
    }

    public void setCodEdificio(String codEdificio) {
        this.codEdificio = codEdificio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.codSede);
        hash = 71 * hash + Objects.hashCode(this.codEdificio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AdmEdificioPK other = (AdmEdificioPK) obj;
        if (!Objects.equals(this.codSede, other.codSede)) {
            return false;
        }
        if (!Objects.equals(this.codEdificio, other.codEdificio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmEdificioPK{" + "codSede=" + codSede + ", codEdificio=" + codEdificio + '}';
    }

}
