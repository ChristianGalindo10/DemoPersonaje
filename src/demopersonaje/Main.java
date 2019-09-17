/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demopersonaje;
import builder.*;
/**
 *
 * @author USUARIO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
         //Crear el objeto director
         Director objFabrica = new Director();
         
         //Crear los objetos concrete builder
         BuilderPersonaje humano = new ConstructorPersonajeHumano();
         
         objFabrica.construir(humano);
         
         
    }
    
}
