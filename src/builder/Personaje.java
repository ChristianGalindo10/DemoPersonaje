/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.awt.Image;

/**
 *
 * @author USUARIO
 */
public class Personaje {
    
    private Image[] up;
    private Image[] down;
    private Image[] left;
    private Image[] right;

    public void setUp(Image[] up) {
        this.up = up;
    }


    public void setDown(Image[] down) {
        this.down = down;
    }


    public void setLeft(Image[] left) {
        this.left = left;
    }

    public void setRight(Image[] right) {
        this.right = right;
    }
    
    
}
