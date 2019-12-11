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
package ec.edu.espe.distribuidas.conjunta.model;

import ec.edu.espe.distribuidas.conjunta.enums.TipoAulaEnum;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Kevin Israel
 */
@Entity
@Table(name = "ADM_AULA")
public class AdmAula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_AULA")
    private Integer codigo;

    @Column(name = "CODIGO_POSTAL", nullable = false, length = 4)
    private String codigoPostal;

    @Column(name = "PISO", nullable = false)
    private Integer piso;

    @Enumerated(EnumType.STRING)
    private TipoAulaEnum tipo;

    @Column(name = "CAPACIDAD", nullable = false)
    private Integer capacidad;

    @JoinColumns({
        @JoinColumn(name = "COD_SEDE", referencedColumnName = "COD_SEDE")
        ,
        @JoinColumn(name = "COD_EDIFICIO", referencedColumnName = "COD_EDIFICIO")
    })
    @ManyToOne
    private AdmEdificio edificio;

    @OneToMany(mappedBy = "aula")
    private List<AdmAsignatParalHorario> horarios;

    public AdmAula() {
    }

    public AdmAula(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public TipoAulaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoAulaEnum tipo) {
        this.tipo = tipo;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.codigo);
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
        final AdmAula other = (AdmAula) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmAula{" + "codigo=" + codigo + ", codigoPostal=" + codigoPostal + ", piso=" + piso + ", tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }

}
