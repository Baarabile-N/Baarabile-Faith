
package quickchatapp;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject; // Ensure you have the JSON library

public class AppMessage {
    private String messageId;
    private static int totalMessages = 0; // Fixed declaration
    private String recipient; // Corrected spelling
    private String content;
    private String messageHash;
    private int messageNumber; // Removed 'final'

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public static int getTotalMessages() {
        return totalMessages;
    }

    public static void setTotalMessages(int totalMessages) {
        AppMessage.totalMessages = totalMessages;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessageHash() {
        return messageHash;
    }

    public void setMessageHash(String messageHash) {
        this.messageHash = messageHash;
    }

    public int getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(int messageNumber) {
        this.messageNumber = messageNumber;
    }
    
    

    public AppMessage(String recipient, String content) {
        this.messageId = generateUniqueId();
        this.recipient = recipient;
        this.content = content;
        this.messageHash = generateHash();
        this.messageNumber = ++totalMessages;
    }

    private String generateUniqueId() {
        long randomNum = (long) (Math.random() * 1_000_000_000); // Fixed reference to Math
        return String.format("%010d", randomNum); // Ensures 10-digit ID
    }

    public boolean isValidId() {
        return messageId.length() == 10;
    }

    public boolean isValidRecipient() {
        return recipient.matches("^[+]?\\d{10,13}$");
    }

    String generateHash() {
        String[] words = content.trim().split("\\s+");
        if (words.length == 0) {
            return "EMPTY_CONTENT"; // Handle case where content is empty
        }
        String firstWord = words[0].toUpperCase();
        String lastWord = words[words.length - 1].toUpperCase();
        return firstWord + "_" + lastWord;
    }

    public void saveToFile(String filename) throws IOException {
        JSONObject json = new JSONObject();
        json.put("id", messageId);
        json.put("number", messageNumber);
        json.put("to", recipient);
        json.put("content", content); // Fixed missing assignment
        json.put("hash", messageHash);

        try (FileWriter file = new FileWriter(filename)) {
            file.write(json.toString(4)); // Pretty-print JSON
        }
    }
}