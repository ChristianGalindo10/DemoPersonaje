/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;
import fabricas.FabricaPersonajes;

/**
 *
 * @author USUARIO
 */
public abstract class BuilderPersonaje {
    
    protected Personaje personaje;

    public Personaje getPersonaje() {
        return personaje;
    }

    public void crearNuevoPersonaje(){
        personaje = new Personaje();
    } 
    
    //---------------------------
    
    //Métodos que deberán ser construídos por las clases que hereden de ésta
    public abstract void construirSpritesUp();
    public abstract void construirSpritesDown();
    public abstract void construirSpritesLeft();
    public abstract void construirSpritesRight();
    
}
