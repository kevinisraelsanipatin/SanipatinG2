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

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Kevin Israel
 */
@Entity
@Table(name = "ADM_SEDE")
public class AdmSede implements Serializable {

    @Id
    @Column(name = "COD_SEDE", nullable = false, length = 10)
    private String codigo;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "DIRECCION", nullable = false, length = 200)
    private String direccion;

    @OneToMany(mappedBy = "sede", fetch = FetchType.LAZY)
    private List<AdmEdificio> edificios;

    public AdmSede() {
    }

    public AdmSede(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<AdmEdificio> getEdificios() {
        return edificios;
    }

    public void setEdificios(List<AdmEdificio> edificios) {
        this.edificios = edificios;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codigo);
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
        final AdmSede other = (AdmSede) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AdmSede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", edificios=" + edificios + '}';
    }

}
