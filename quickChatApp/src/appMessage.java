/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.ietf.jgss.MessageProp;
import java.io.FileFilter;
import java.io.IOException;

public class appMessage {
    private String mesaageId;
    private static int totalMessages = 0;
    private int messageNumber;
    private String recipient;
    private String content;
    private String messageHash;
    
    public appMessage (String recipient,String content) {
        this.mesaageId = generateUniqueId();
        this.recipient = recipient;
        this.content = content;
        this.messageNumber = ++totalMessages;
        this.messageHash = generateHash();
        
  }

    private String generateUniqueId() {
     long randomNum = (long)(Math.random()*1_000_000_000L) ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   return 
           String.format("%010d", randomNum);
    }
    

    private String generateHash() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
