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
                editarAnimal();
                System.out.println("");
            }
            if(opcion==3){
                eliminarAnimal();
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
        System.out.print("Ingrese el nombre Cientifico del Animal a Editar: ");
        lea.nextLine();
        String nom = lea.nextLine();
        int pos=0;
        boolean sePuede=false;
        for (Animales animales : registro) {
            if(nom.equalsIgnoreCase(animales.getNomCientifico())){
                sePuede=true;
                pos = (registro.indexOf(animales));
                break;
            }
        }
        if(sePuede==true){
            System.out.println("1) Editar un Atributo ");
            System.out.println("2) Editar Todo");
            System.out.print("Ingrese una opcion: ");
            int op = lea.nextInt();
            if(op==1){
                editarAtributo(pos);
                System.out.println("El atributo se ha modificado exitosamente");
            }
            else if(op==2){
                editarTodo(pos);
                System.out.println("Los atributos se han modificado exitosamente");
            }
            else{
                System.out.println("Debe de ingresar un nombre valido");
            }
        }
    }
    public static void editarAtributo(int pos){
        System.out.println("1. Nombre Cientifico");
        System.out.println("2. Nombre Comun");
        System.out.println("3. Habitat");
        System.out.println("4. Alimentacion");
        System.out.println("5. Descripcion de Rasgos");
        System.out.println("6. Distribuicion Geografica");
        System.out.println("7. Vida");
        System.out.print("Ingrese la opcion: ");
        int opcion = lea.nextInt();
        if(opcion == 1){
            System.out.print("Nombre Cientifico: ");
            registro.get(pos).setNomCientifico(lea.nextLine());
        }else if(opcion == 2){
            System.out.print("Nombre Comun: ");
            registro.get(pos).setNomComun(lea.nextLine());
        }else if(opcion == 3){
            System.out.print("Habitat: ");
            registro.get(pos).setHabitat(lea.nextLine());
        }else if(opcion == 4){
            System.out.println("Alimentacion: ");
            registro.get(pos).setAlimentacion(lea.nextLine());
        }else if(opcion == 5){
            System.out.print("Descripcion de Rasgos: ");
            registro.get(pos).setDescripRasgos(lea.nextLine());
        }else if(opcion == 6){
            System.out.print("Distribuicion Geografica: ");
            registro.get(pos).setDistrGeo(lea.nextLine());
        }else if(opcion == 7){
            System.out.println("Vida: ");
            registro.get(pos).setVida(lea.nextInt());
        }
    }
    public static void editarTodo(int pos){
        System.out.print("Nombre Cientifico: ");
        registro.get(pos).setNomCientifico(lea.nextLine());
        System.out.print("Nombre Comun: ");
        registro.get(pos).setNomComun(lea.nextLine());
        System.out.print("Habitat: ");
        registro.get(pos).setHabitat(lea.nextLine());
        System.out.println("Alimentacion: ");
        registro.get(pos).setAlimentacion(lea.nextLine());
        System.out.print("Descripcion de Rasgos: ");
        registro.get(pos).setDescripRasgos(lea.nextLine());
        System.out.print("Distribuicion Geografica: ");
        registro.get(pos).setDistrGeo(lea.nextLine());
        System.out.println("Vida: ");
        registro.get(pos).setVida(lea.nextInt());
            
    }
    public static void eliminarAnimal(){
        System.out.print("Ingrese el nombre Cientifico del Animal a Eliminar: ");
        lea.nextLine();
        String nom = lea.nextLine();
        int pos=0;
        boolean sePuede=false;
        for (Animales animales : registro) {
            if(nom.equalsIgnoreCase(animales.getNomCientifico())){
                sePuede=true;
                pos = (registro.indexOf(animales));
                break;
            }
        }
        if(sePuede==true){
            registro.remove(pos);
            System.out.println("El animal se ha eliminado exitosamente");
        }
        else{
            System.out.println("Debe de Ingresar un Nombre Cientifico Valido");
        }
        
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
