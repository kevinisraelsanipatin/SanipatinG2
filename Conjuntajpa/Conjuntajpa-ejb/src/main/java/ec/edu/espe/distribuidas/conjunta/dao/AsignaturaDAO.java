/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: Conjuntajpa-ejb
 * 
 * Creado: 10/12/2019 - 19:46:07
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.conjunta.dao;

import ec.edu.espe.distribuidas.conjunta.model.AdmAsignatura;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Kevin Israel
 */

@Stateless
@LocalBean
public class AsignaturaDAO extends AbstractDAO<AdmAsignatura>{
    
    public AsignaturaDAO() {
        super(AdmAsignatura.class);
    }
    
    /**
     * Metodo Finder que obtiene un GenPais en base al ruc
     *
     * @param ruc El ruc del GenPais con el que se va a relaizar la busqueda.
     * @return GenPais en base al ruc del GenPais.
     */
    public AdmAsignatura findByRuc(String ruc) {
        return this.finder(
                "SELECT c FROM GenPais c WHERE c.ruc=?1",
                new Object[]{
                    ruc
                }).get(0);
    }

    /**
     * Metodo Finder que obtiene un GenPais en base al correo
     *
     * @param correoElectronico El correoElectronico del GenPais con el que se
     * va a relaizar la busqueda.
     * @return GenPais en base al correo del GenPais.
     */
    public AdmAsignatura findByCorreoElectronico(String correoElectronico) {
        return this.finder(
                "SELECT c FROM GenPais c WHERE c.correoElctronico=?1",
                new Object[]{
                    correoElectronico
                }).get(0);
    }

    /**
     * Metodo Finder que obtiene un Listado en base al codigoLocacion
     *
     * @param codigoLocacion El codigoLocacion del GenPais con el que se va a
     * relaizar la busqueda.
     * @return Listado en base al codigoLocacion del GenPais.
     */
    public List<AdmAsignatura> findByCodigoLocacion(Integer codigoLocacion) {
        return this.finder(
                "SELECT c FROM GenPais c WHERE c.locacion.codigo=?1",
                new Object[]{
                    codigoLocacion
                });
    }

    /**
     * Metodo Finder que obtiene un GenPais en base al telefono
     *
     * @param telefono El telefono del GenPais con el que se va a relaizar la
     * busqueda.
     * @return GenPais en base al telefono del GenPais.
     */
    public AdmAsignatura findByCodigoTelefono(String telefono) {
        return this.finder(
                "SELECT c FROM GenPais c WHERE c.telefono=?1",
                new Object[]{
                    telefono
                }).get(0);
    }

}
