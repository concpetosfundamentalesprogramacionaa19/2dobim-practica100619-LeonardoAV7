/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2do;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
/**
 *
 * @author Leonardo Aguilar
 */
public class LeerArchivo {
    public static void leerRegistros() {
        
        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new 
                File("tabula-FWC_2018_Squadlists_4.csv"));
            double suma = 0;
            double suma2 = 0;
            int contador = 0;
            
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                // System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                // da el valor del arreglo a la variable y se acumula
                double dato = Double.parseDouble(linea_partes.get(11));
                suma = suma + dato;
                double dato2 = Double.parseDouble(linea_partes.get(9));
                suma2 = suma2 + dato2;
                contador = contador + 1;
                
            }// fin de while
            
            entrada.close();
            double promedio = suma / contador ;
            double promedio2 = suma2 / contador ;
            System.out.printf("Promedio Goals: %.2f\nPromedio Height: %.2f\n",
                    promedio, promedio2);
            
        }
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }// fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n
    
}
