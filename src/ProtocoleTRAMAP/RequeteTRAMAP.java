/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtocoleTRAMAP;

import java.io.Serializable;

/**
 *
 * @author david
 */
public class RequeteTRAMAP  implements Serializable{
    private static final long serialVersionUID = 1L;
    public static String LOGIN = "LOGIN";
    public static String LOGOUT = "LOGOUT";
    public static String INPUT_LORRY = "INPUT_LORY";
    public static String VERIF_NUM_RESA = "VERIF_NUM_RESA";
    public static String INPUT_LORRY_WITHOUT_RESA = "INPUT_LORRY_WITHOUT_RESA";
    public static String GET_LIST_OP = "GET_LIST_OP";
    
    private String dateDep;
    private String dateFin;
    private String condition;
    private String Imma;
    private String id;
    private String numR;
    private User user;
    private String type;
    private InputLorry il;
    
    public RequeteTRAMAP(String t, User usr){
        type = t;
        user = usr;
    }
    
    public RequeteTRAMAP(String t){
        type = t;
    }
    
    public RequeteTRAMAP(String t, String nr){
        type = t;
        numR = nr;
    }
    
    public RequeteTRAMAP(String t, String imma, String i){
        type = t;
        Imma = imma;
        id = i;
    }
    
    public RequeteTRAMAP(String t, String dDep, String dFin, String cond){
        type = t;
        dateDep = dDep;
        dateFin = dFin;
        condition = cond;
    }
    
    public RequeteTRAMAP(String t, InputLorry i){
        type = t;
        il = i;
    }

    /**
     * @return the numR
     */
    public String getNumR() {
        return numR;
    }

    /**
     * @param numR the numR to set
     */
    public void setNumR(String numR) {
        this.numR = numR;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the il
     */
    public InputLorry getIl() {
        return il;
    }

    /**
     * @param il the il to set
     */
    public void setIl(InputLorry il) {
        this.il = il;
    }
}
