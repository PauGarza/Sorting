/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.*;
import static ordenamiento.Peliculas.*;
import java.lang.Math.*; 

/**
 *
 * @author pauli
 * @param <T>
 */
public class Ordenamiento <T extends Comparable<T>> {

    public int cont=0;
    
    public void reiniciaCont(){
        cont = 0;
    }
    
    public int getCont(){
        return cont;
    }

    private void swap(T []arr, int a, int b) {
	T temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
    }
    
    public void selectionSort (T arr[]){
        for (int i = 0; i < arr.length-1; i++){
            int min = i;
            for (int j = i+1; j < arr.length; j++){ 
                if(arr[j].compareTo(arr[min])<0){
                    min = j;  
                }
                cont++;
            }
            swap(arr,min,i);
        }
    }
    
    public void insertionSort (T arr[]){
        for (int i = 1; i < arr.length; i++){
            T key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j].compareTo(key)>0){
                arr[j+1] = arr[j];
                j = j-1;
                cont++;
            }
            arr[j+1] = key;
        }
    }
    
    public void bubbleSort (T arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j].compareTo(arr[j+1])>0){
                    swap(arr,j,j+1);
                }
                cont++;
            }
        }
    }
    
    private int particiona (T arr [], int inf, int sup){
        T pivote = arr[sup];
        int i = (inf-1);
        for (int j = inf; j <= sup; j++) {
            if(arr[j].compareTo(pivote)<0){
                i++;
                swap(arr,j,i);
            }
            cont++;
        }
        swap(arr,i+1,sup);
        return (i+1);
    }
    
    public void quickSort (T arr[]){
        quickSort(arr, 0, arr.length-1, 0);
    } 
    
    private void quickSort (T arr[], int inf, int sup,int cont){
        if(inf>=sup){
            return;
        }
        int indice = particiona (arr,inf,sup);
        quickSort(arr,inf,indice-1,cont);
        quickSort(arr,indice+1,sup,cont);
        cont++;
    } 
    
    private void mezcla(T arr[], int inf, int med, int sup) { 
        int i, j, k; 
        int n1 = med - inf + 1; 
        int n2 = sup - med; 

        ArrayList<T> infarr = new ArrayList<T>();
        ArrayList<T> suparr = new ArrayList<T>();

        for (i = 0; i < n1; i++) 
            infarr.add(arr[inf + i]);
        for (j = 0; j < n2; j++) 
            suparr.add(arr[med + j]); 

        i = 0; 
        j = 0;  
        k = inf; 
        while (i < n1 && j < n2) { 
            if (infarr.get(i).compareTo(suparr.get(j))<0) { 
                arr[k] = infarr.get(i); 
                i++; 
            }else { 
                arr[k] = suparr.get(j); 
                j++; 
            } 
            k++; 
            cont++;
        } 

        while (i < n1-1) { 
            arr[k] = infarr.get(i); 
            i++; 
            k++; 
            cont++;
        } 

        while (j < n2-1) { 
            arr[k] = suparr.get(j); 
            j++; 
            k++; 
            cont ++;
        } 
    } 

    private void mergeSort(T arr[], int inf, int sup) { 
        if (inf < sup) { 
            int med = (inf + sup) / 2;
            
            mergeSort(arr, inf, med); 
            mergeSort(arr, med + 1, sup); 
            
            mezcla(arr, inf, med, sup);
            cont++;
        }
    } 

    public void mergeSort(T arr[]){
        mergeSort(arr,0,arr.length);
    }
    
    public void mixcoacSort(T arr[]) {
        int n = arr.length;
        int tam, ini;

        for (tam = 1; tam <= n-1; tam = 2*tam){ 
            for (ini = 0; ini < n-1;ini += 2*tam){ 
                int mid = Math.min(ini + tam - 1, n-1); 
                int fin = Math.min(ini + 2*tam - 1, n-1);
                mezcla(arr, ini, mid, fin); 
                cont ++;
            } 
        }
    }
    
    public void quickSortUli(T[] arr, int inf, int sup){
        
        
        
        
        //Caso base
        if(inf >= sup){
            return;
        }
        
        int indice = particiona3(arr,inf,sup);
        
        
        
        
        
        //mitadInferior
        
        quickSortUli(arr,inf,indice-1);
        //mitadSuperior
        quickSortUli(arr,indice+1,sup);
  
    }
    private int particiona3(T arr [], int inf, int sup){
        T pivote = arr[sup];
        int i = (inf-1);
        
        for (int j = inf; j <= sup; j++) {
            cont++;
            if(arr[j].compareTo(pivote)<0){
                i++;
                T aux = arr[j];
                arr[j] = arr[i];
                arr[i] = aux;
                
            }
            
        }
        T aux = arr[i+1];
        arr[i+1] = arr[sup];
        arr[sup] = aux;
              
        return (i+1);
    }
  
}
