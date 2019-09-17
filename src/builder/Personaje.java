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
class Personaje {
    
    private Image[] up;
    private Image[] down;
    private Image[] left;
    private Image[] right;

    public Personaje(){
        
    }
    
    public Image[] getUp() {
        return up;
    }

    public void setUp(Image[] up) {
        this.up = up;
    }

    public Image[] getDown() {
        return down;
    }

    public void setDown(Image[] down) {
        this.down = down;
    }

    public Image[] getLeft() {
        return left;
    }

    public void setLeft(Image[] left) {
        this.left = left;
    }

    public Image[] getRight() {
        return right;
    }

    public void setRight(Image[] right) {
        this.right = right;
    }
    
    
}
