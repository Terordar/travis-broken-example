/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtocoleTRAMAP;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pierre
 */
public class Container implements Serializable{
    private int id;
    private int x;
    private int y;
    private int flag;
    private Date dateResa;
    private Date dateArr;
    private int poids;
    private String destination;
    private int moyenTransport;
    private static final long serialVersionUID = 3L;
    
    public Container(int id)
    {
        this.id = id;
    }
    
    public Container(int id, int xx, int yy)
    {
        this.id = id;
        this.x = xx;
        this.y = yy;
        
        
    }public Container()
    {
        this.id = 0;
        this.x = 0;
        this.y = 0;
        
        
    }

    public Container(int id, int x, int y, int flag, String dateResa, String dateArr, int poids, String destination, int moyenTransport){
        this.id = id;
        this.x = x;
        this.y = y;
        this.flag = flag;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dateResa = formatter.parse(dateResa);
            this.dateArr = formatter.parse(dateArr);
        } catch (ParseException ex) {
            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.poids = poids;
        this.destination = destination;
        this.moyenTransport = moyenTransport;
    }

    public Container(int id, String destination, int moyenTransport){
        this.id = id;
        this.x = -1;
        this.y = -1;
        this.flag = 2;
        this.dateResa = null;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        this.dateArr = date;
        this.poids = -1;
        this.destination = destination;
        this.moyenTransport = moyenTransport;
    }

    @Override
    public String toString(){
        /*DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String reportDate = df.format(dateArr);*/
        return "" + id/* + " arrivé le " + reportDate*/;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the flag
     */
    public int getFlag() {
        return flag;
    }

    /**
     * @param flag the flag to set
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }

    /**
     * @return the dateResa
     */
    public Date getDateResa() {
        return dateResa;
    }

    /**
     * @param dateResa the dateResa to set
     */
    public void setDateResa(Date dateResa) {
        this.dateResa = dateResa;
    }

    /**
     * @return the dateArr
     */
    public Date getDateArr() {
        return dateArr;
    }

    /**
     * @param dateArr the dateArr to set
     */
    public void setDateArr(Date dateArr) {
        this.dateArr = dateArr;
    }

    /**
     * @return the poids
     */
    public int getPoids() {
        return poids;
    }

    /**
     * @param poids the poids to set
     */
    public void setPoids(int poids) {
        this.poids = poids;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the moyenTransport
     */
    public int getMoyenTransport() {
        return moyenTransport;
    }

    /**
     * @param moyenTransport the moyenTransport to set
     */
    public void setMoyenTransport(int moyenTransport) {
        this.moyenTransport = moyenTransport;
    }
}
