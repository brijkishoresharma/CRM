/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRM;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brij kishore sharma
 */
public class Hashid {
     public static String hashingid(String pass2){
         try {
             MessageDigest messagedigest = MessageDigest.getInstance("MD5");
             messagedigest.update(pass2.getBytes());
             byte[] resultByteArray = messagedigest.digest();
             StringBuilder sb = new StringBuilder();
             for(byte b :resultByteArray){
             sb.append(String.format("%02x",b));
             }
             return sb.toString();
                     } 
         catch (NoSuchAlgorithmException ex) {
             ex.printStackTrace();
         }
         return "";
     }
}
