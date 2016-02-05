/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProtocoleTRAMAP;

import java.io.*;
import java.net.*;

/**
 *
 * @author david
 */
public class Client {
    private Socket cliSock;
    
    public Client(){
        cliSock = null;
    }
    
    public void open(String address, int port) throws UnknownHostException, IOException {
            setCliSock(new Socket(address, port));   
    }
    
    public void sendRequest(RequeteTRAMAP req) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(getCliSock().getOutputStream());
        oos.writeObject(req);
        oos.flush();
    }
    
    public void close() throws IOException{
        getCliSock().close();
    }
    
    public ReponseTRAMAP getResponse() throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(getCliSock().getInputStream());
        ReponseTRAMAP rep = (ReponseTRAMAP)ois.readObject();
        return rep;
    }

    /**
     * @return the cliSock
     */
    public Socket getCliSock() {
        return cliSock;
    }

    /**
     * @param cliSock the cliSock to set
     */
    public void setCliSock(Socket cliSock) {
        this.cliSock = cliSock;
    }
    
    
}
