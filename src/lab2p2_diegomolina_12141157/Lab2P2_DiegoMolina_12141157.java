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
        animal2 = new Animales("Haliaeetus Leucocephalus", "Aguila Calva", "Cerca de rios, lagos, pantanos u oceanos", "Pescados, Gusanos, Serpientes", "Cabeza Blanca, Cola Redonda, Alas Largas", "America del Norte", 20);
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
                agregarAnimal();
                System.out.println("");
            }
            if(opcion==2){
                
            }
            if(opcion==3){
                
            }
            if(opcion==4){
                listarAnimal();
                System.out.println("");
            }
            if(opcion==5){
                
            }
            if(opcion==6){
                System.exit(0);
            }
        }//fin while
    }//fin main
    public static void agregarAnimal(){
        System.out.print("Ingrese el Nombre Cientifico: ");
        lea.nextLine();
        String nomCientifico = lea.nextLine();
        System.out.print("Ingrese el nombre comun: ");
        String nomComun = lea.nextLine();
        System.out.print("Ingrese el habitat: ");
        String habitat = lea.nextLine();
        System.out.print("Ingrese la Alimentacion: ");
        String alimentacion = lea.nextLine();
        System.out.print("Ingrese una descripcion de los rasgos: ");
        String rasgos = lea.nextLine();
        System.out.print("Ingrese la distribuicion Geografica: ");
        String disGeo = lea.nextLine();
        System.out.print("Ingrese la vida: ");
        int vida = lea.nextInt();
        registro.add(new Animales(nomCientifico, nomComun, habitat, alimentacion, rasgos, disGeo, vida));
    }    
    public static void editarAnimal(){
    
    }
    public static void listarAnimal(){
        System.out.println("1) Listar por Posicion");
        System.out.println("2) Listar Todos");
        System.out.println("3) Listar por Nombre Cientifico");
        System.out.print("Ingrese una opcion: ");
        int op = lea.nextInt();
        System.out.println("");
        if(op==1){
            listarPosicion();
            System.out.println("");
        }
        else if(op==2){
            listarTodos();
            System.out.println("");
        }
        else if(op==3){
            listarNombre();
            System.out.println("");
        }
    }
    public static void listarPosicion(){
        System.out.print("Ingrese una posicion (0 a "+(registro.size()-1)+"): ");
        int pos = lea.nextInt();
            System.out.print(pos+" -> "+registro.get(pos));
    }
    public static void listarTodos(){
        for (Animales animales : registro) {
            System.out.println(registro.indexOf(animales)+" -> "+animales.toString());
        }
    }
    public static void listarNombre(){
        System.out.print("Ingrese el nombre cientifico del animal: ");
        lea.nextLine();
        String nom = lea.nextLine();
        for (Animales animales : registro) {
            if(nom.equalsIgnoreCase(animales.getNomCientifico())){
                System.out.print(registro.indexOf(animales)+" -> "+animales.toString());
            }
        }
    }
}
