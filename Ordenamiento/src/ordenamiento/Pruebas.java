/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import static ordenamiento.Peliculas.*;

/**
 *
 * @author pauli
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ordenamiento o = new Ordenamiento();
        int tam;
        long inicio = System.nanoTime();
        long fin = System.nanoTime();
        long tiempo;
        
        int tamaño[] ={1,2,5,7,10,20,50,70,100,200,500,700,1000,2000,5000,7000,10000};
        for(int j=0; j < tamaño.length; j++){
            
            tam=tamaño[j];
            //System.out.println("Tamaño: "+tam );

            String arr[] = ordenDesc(tam);
            String arr0[]= new String[tam];
            String arr1[]= new String[tam];
            String arr2[]= new String[tam];
            String arr3[]= new String[tam];
            String arr4[]= new String[tam];
            String arr5[]= new String[tam];

            for(int i = 0; i < tam; i++){
                arr0[i]=arr[i];
                arr1[i]=arr[i];
                arr2[i]=arr[i];
                arr3[i]=arr[i];
                arr4[i]=arr[i];
                arr5[i]=arr[i];
            }

            //inicio = System.nanoTime();
            o.mergeSort(arr0);
            //fin = System.nanoTime();
            //tiempo = fin-inicio;
            System.out.println(o.getCont());
            o.reiniciaCont();

            /**inicio = System.nanoTime();
            o.insertionSort(arr1);
            fin = System.nanoTime();
            tiempo = fin-inicio;
            System.out.println("inserttion: "+o.getCont()+" tiempo:"+tiempo);
            o.reiniciaCont();

            inicio = System.nanoTime();
            o.bubbleSort(arr2);
            fin = System.nanoTime();
            tiempo = fin-inicio;
            System.out.println("bubble: "+o.getCont()+" tiempo:"+tiempo);
            o.reiniciaCont();

            inicio = System.nanoTime();
            o.quickSort(arr3);
            fin = System.nanoTime();
            tiempo = fin-inicio;
            System.out.println("quick: "+o.getCont()+" tiempo:"+tiempo);
            o.reiniciaCont();

            inicio = System.nanoTime();
            o.mergeSort(arr4);
            fin = System.nanoTime();
            tiempo = fin-inicio;
            System.out.println("merge: "+o.getCont()+" tiempo:"+tiempo);
            o.reiniciaCont();

            inicio = System.nanoTime();
            o.mixcoacSort(arr5);
            fin = System.nanoTime();
            tiempo = fin-inicio;
            System.out.println("mixcoac: "+o.getCont()+" tiempo:"+tiempo);
            o.reiniciaCont();
            
            System.out.println("");
            */
        }
      
    }
    
}
