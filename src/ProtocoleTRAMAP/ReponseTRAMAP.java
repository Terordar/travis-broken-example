/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtocoleTRAMAP;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Pierre
 */
public class ReponseTRAMAP implements Serializable{
    private static final long serialVersionUID = 1L;
    public static String LOGIN_OK = "LOGIN_OK";
    public static String LOGOUT_OK = "LOGOUT_OK";
    public static String WRONG_PASSWORD = "WRONG_PASSWORD";
    public static String SEARCH_RESA_OK = "SEARCH_RESA_OK";
    public static String SEARCH_RESA_ERROR = "SEARCH_RESA_ERROR";
    public static String IL_OK = "IL_OK";
    public static String IL_ERR = "IL_ERR";
    public static String ILWR_ERR = "ILWR_ERR";
    public static String ILWR_OK = "ILWR_OK";
    public static String LIST_OK = "LIST_OK";
    public static String LIST_ERR = "LIST_ERR";
    
    private ArrayList<Integer> alin;
    private String codeRetour;
    private User user;
    private String place;
    private int containeridfromresa;
    private int x;
    private int y;
    
    public ReponseTRAMAP(String c){
        codeRetour = c;
    }
    
    public ReponseTRAMAP(String c, User usr){
        codeRetour = c;
        user = usr;
    }
    
    public ReponseTRAMAP(String c, ArrayList<Integer> ali, int i){
        codeRetour = c;
        alin = ali;
    }
    
    public ReponseTRAMAP(String c, ArrayList<Integer> cif){
        codeRetour = c;
        containeridfromresa = cif.get(0);
        x = cif.get(1);
        y = cif.get(2);
    }
    
    /**
     * @return the codeRetour
     */
    public String getCode() {
        return codeRetour;
    }
    
    public String getPlace(){
        return place;
    }
    
    public ArrayList<Integer> getAlin(){
        return alin;
    }

    /**
     * @param codeRetour the codeRetour to set
     */
    public void setCode(String codeRetour) {
        this.codeRetour = codeRetour;
    }

    /**
     * @return the containeridfromresa
     */
    public int getContId() {
        return containeridfromresa;
    }

    /**
     * @param containeridfromresa the containeridfromresa to set
     */
    public void setContId(int containeridfromresa) {
        this.containeridfromresa = containeridfromresa;
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
}
