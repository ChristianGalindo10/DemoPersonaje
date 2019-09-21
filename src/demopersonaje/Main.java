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

     public static void main(String[] args) {
        
         Director director = new Director();
         BuilderPersonaje humano = new ConstructorPersonajeHumano();
         
         director.setBuilderPersonaje(humano);
         director.construirPersonaje();
         
         Personaje personaje = director.getPersonaje();
        
         
         
    }
    
}
