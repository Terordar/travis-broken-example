/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtocoleTRAMAP;

import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author david
 */
public class InputLorry implements Serializable{
    private static final long serialVersionUID = 5L;
    private String numReservation;
    private Container c;
    private final ArrayList<Container> listeContainers;
    
    public InputLorry(String nR)
    {
        numReservation = nR;
        c = new Container();
        listeContainers = new ArrayList<Container>();
    }
    public InputLorry(String nR, int id, int x, int y)
    {
        numReservation = nR;
        c = new Container(id, x, y);
        listeContainers = new ArrayList<Container>();
    }
    
    public void addContainer(Container c)
    {
        getListeContainers().add(c);
    }

    /**
     * @return the numReservation
     */
    public String getNumReservation() {
        return numReservation;
    }

    /**
     * @param numReservation the numReservation to set
     */
    public void setNumReservation(String numReservation) {
        this.numReservation = numReservation;
    }

    /**
     * @return the listeContainers
     */
    public ArrayList<Container> getListeContainers() {
        return listeContainers;
    }
    
    public String toString(){
        String s = "";
        
        
        return numReservation + "#" + c.getX() + "#" + c.getY();
    }

    /**
     * @return the c
     */
    public Container getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Container c) {
        this.c = c;
    }
    
   
}
