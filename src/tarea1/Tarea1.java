/*

 */
package tarea1;

import java.io.*;
import java.util.*;

public class Tarea1 {
    public static void main(String[] args) {
        try {
            Integer tamanio;
            int [] arreglo;

            String cadena = "";
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader bf=new BufferedReader(fr);
            tamanio=Integer.parseInt(bf.readLine());//leo la primera linea y la convierto a Integer
            arreglo=new int[tamanio];//asigno a mi arreglo el tamaño que marca mi primera linea
           
            while ((cadena=bf.readLine())!=null) {      //Leo el archivo 
                 for (int i = 0; i <tamanio; i++) {//guardo en el archivo
                arreglo[i]=i+1;
            }
            }
            for (int k =tamanio; k>0; k--) {//arreglo de manera inversa con un ciclo que empieze desde el final hasta el principio y que decremente
                System.out.println(arreglo[k-1]);
            }
             bf.close();
        } catch (Exception e) {
            System.out.println("Archivo no encontrado");
        }
    }
    }

