/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_diegomolina_12141157;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lab2P2_DiegoMolina_12141157 {

    /**
     * @param args the command line arguments
     */
    public static Scanner lea = new Scanner(System.in);
    public static ArrayList<Animales> registro = new ArrayList();
    public static Animales animal1 = new Animales();
    public static Animales animal2 = new Animales();
    public static Animales animal3 = new Animales();
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        animal1 = new Animales("Panthera Leo", "Leon", "Sabanas", "Carne", "Mamifero, Color Dorado, Depredadores, Pesados, Cuatro Patas", "Africa y Pequena parte de Asia", 15);
        animal2 = new Animales("Haliaeetus leucocephalus", "Aguila Calva", "Cerca de rios, lagos, pantanos u oceanos", "Pescados, Gusanos, Serpientes", "Cabeza Blanca, Cola Redonda, Alas Largas", "America del Norte", 20);
        animal3 = new Animales("Serpentes", "Serpiente", "Regiones Selvaticas, Desiertos, Sabanas, Agua", "Carne", "Venenosas, Sin Extremidades, Varia su Tamano, Sin Patas", "Por Todo el Mundo", 10);
        registro.add(animal1);
        registro.add(animal2);
        registro.add(animal3);
        while(opcion!=6){
            System.out.println("1) Agregar Animal");
            System.out.println("2) Editar Animal");
            System.out.println("3) Eliminar Animal");
            System.out.println("4) Listar Animales");
            System.out.println("5) Cadena Alimenticia");
            System.out.println("6) Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = lea.nextInt();
            System.out.println("");
            if(opcion==1){
                
            }
            if(opcion==2){
                
            }
            if(opcion==3){
                
            }
            if(opcion==4){
                
            }
            if(opcion==5){
                
            }
            if(opcion==6){
                System.exit(0);
            }
        }//fin while
    }
    
}
