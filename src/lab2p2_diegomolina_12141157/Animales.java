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
    
}
