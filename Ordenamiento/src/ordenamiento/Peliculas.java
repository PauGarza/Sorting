/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.io.*;
import java.util.*;

/**
 *
 * @author pauli
 */
public class Peliculas {
    
     public static String[] ordenAsc(int tam){
        File archivo;
	Scanner lectura;
        String[] peliculas = new String[tam];
        
        try{
            archivo = new File ("Orden.txt");
            lectura = new Scanner (archivo);
           
            for(int i = 0; i < peliculas.length; i++){
                peliculas[i] = lectura.nextLine();
            }
            lectura.close();
        }catch(Exception e){
            System.out.println("No se pudo leer el archivo.");
        }
        return peliculas; 
    }
    
    public static void invertirManual(String[] arreglo) {
    String temporal; // El elemento temporal del arreglo que vamos a intercambiar
    int longitudDeArreglo = arreglo.length;
    // Nota: al dividir entre 2, si es flotante, se pasa al entero anterior. P. ej.
    // 5 / 2 = 2
    for (int x = 0; x < longitudDeArreglo / 2; x++) {
      // Guardar el actual
      temporal = arreglo[x];
      // El índice de la otra mitad
      int indiceContrario = longitudDeArreglo - x - 1;
      // El valor actual es el valor contrario, el de la otra mitad
      arreglo[x] = arreglo[indiceContrario];
      // Y el de la otra mitad, es el que había en el actual originalmente
      arreglo[indiceContrario] = temporal;
    }
    // El arreglo ya está invertido internamente
  }
    
    public static String[] ordenDesc(int tam){
        File archivo;
	Scanner lectura;
        String[] peliculas = new String[tam];
        
        try{
            archivo = new File ("Orden.txt");
            lectura = new Scanner (archivo);
      
            for(int i = 0; i < peliculas.length; i++){
                peliculas[i] = lectura.nextLine();
            }
            lectura.close();
        }catch(Exception e){
            System.out.println("No se pudo leer el archivo.");
        }
        invertirManual(peliculas);
        return peliculas;
    }
    
    private static  void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void shuffle(String[] array) {
        Random random = new Random();
        int i = 0;
        for (int j : random.ints(array.length, 0, array.length).toArray()) {
            swap(array, i++, j);
        }
    }
    
    public static String[] ordenAl(int tam){
        File archivo;
	Scanner lectura;
        String[] peliculas = new String[tam];
        
        try{
            archivo = new File ("Orden.txt");
            lectura = new Scanner (archivo);
      
            for(int i = 0; i < peliculas.length; i++){
                peliculas[i] = lectura.nextLine();
            }
            lectura.close();
        }catch(Exception e){
            System.out.println("No se pudo leer el archivo.");
        }
        shuffle(peliculas);
        return peliculas;
    }
    
}
