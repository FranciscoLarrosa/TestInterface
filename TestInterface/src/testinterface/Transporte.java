/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinterface;

/**
 *
 * @author Satoru
 */
public abstract class Transporte implements Comparable {
    int velMax;

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }
    public int compareTo(Object o){
        Transporte t = (Transporte)o;
        if (this.velMax < t.getVelMax()) {
            return -1;
        }
        if (this.velMax == t.getVelMax()) {
            return 0;
        }
        return 1;
    }
            
}
