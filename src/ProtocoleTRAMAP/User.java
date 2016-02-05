package ProtocoleTRAMAP;

import java.io.Serializable;

/**
 * Created by Pierre on 21/10/2015.
 */
public class User implements Serializable{
    private static final long serialVersionUID = 2L;
    
    private String username;
    private String password;

    public User(String usnm, String pswd){
        username = usnm;
        password = pswd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
