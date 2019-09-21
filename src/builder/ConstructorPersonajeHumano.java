/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


import fabricas.FabricaHumano;
import fabricas.FabricaPersonajes;
import objetos.Sprites;

/**
 *
 * @author USUARIO
 */
public class ConstructorPersonajeHumano extends BuilderPersonaje {

    Sprites sprites;
    
    public void usarSprites(FabricaPersonajes personaje){
        sprites = personaje.crearSprites();
    }
    
    @Override
    public void construirSpritesUp() {
        usarSprites(new FabricaHumano());
        personaje.setUp(sprites.getSpritesUp());
    }

    @Override
    public void construirSpritesDown() {
        usarSprites(new FabricaHumano());
        personaje.setDown(sprites.getSpritesDown());
    }

    @Override
    public void construirSpritesLeft() {
        usarSprites(new FabricaHumano());
        personaje.setLeft(sprites.getSpritesLeft());
    }

    @Override
    public void construirSpritesRight() {
        usarSprites(new FabricaHumano());
        personaje.setRight(sprites.getSpritesRight());
    }

}
