/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_diegomolina_12141157;

/**
 *
 * @author diego
 */
public class Animales {
    private String nomCientifico;
    private String nomComun;
    private String habitat;
    private String alimentacion;
    private String descripRasgos;
    private String distrGeo;
    private int vida;

    public Animales() {
    }

    public Animales(String nomCientifico, String nomComun, String habitat, String alimentacion, String descripRasgos, String distrGeo, int vida) {
        this.nomCientifico = nomCientifico;
        this.nomComun = nomComun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.descripRasgos = descripRasgos;
        this.distrGeo = distrGeo;
        this.vida = vida;
    }

    public String getNomCientifico() {
        return nomCientifico;
    }

    public void setNomCientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    public String getNomComun() {
        return nomComun;
    }

    public void setNomComun(String nomComun) {
        this.nomComun = nomComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDescripRasgos() {
        return descripRasgos;
    }

    public void setDescripRasgos(String descripRasgos) {
        this.descripRasgos = descripRasgos;
    }

    public String getDistrGeo() {
        return distrGeo;
    }

    public void setDistrGeo(String distrGeo) {
        this.distrGeo = distrGeo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Animales{" + "nomCientifico=" + nomCientifico + ", nomComun=" + nomComun + ", habitat=" + habitat + ", alimentacion=" + alimentacion + ", descripRasgos=" + descripRasgos + ", distrGeo=" + distrGeo + ", vida=" + vida + '}';
    }
    
}
