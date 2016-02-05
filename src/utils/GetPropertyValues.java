/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pierre
 */
public class GetPropertyValues {
    
    public static String getPropValues(String propriete){
        FileReader reader = null;
        try {
            Properties prop = new Properties();
            reader = new FileReader("src/config.properties");
            if(reader != null){
                try {
                    prop.load(reader);
                    return prop.getProperty(propriete);
                } catch (IOException ex) {
                    Logger.getLogger(GetPropertyValues.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   return null;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GetPropertyValues.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(GetPropertyValues.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
