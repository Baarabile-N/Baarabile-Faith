package quickchatapp;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

public class AppMessageTest {

    @Test
    public void testGenerateUniqueId() {
        AppMessage message = new AppMessage("+1234567890", "Hello, World!");
        assertEquals(10, message.isValidId());
    }

    @Test
    public void testIsValidRecipient() {
        AppMessage validMessage = new AppMessage("+1234567890", "Valid recipient");
        assertTrue(validMessage.isValidRecipient());

        AppMessage invalidMessage = new AppMessage("12345", "Invalid recipient");
        assertFalse(invalidMessage.isValidRecipient());
    }

    @Test
    public void testGenerateHash() {
        AppMessage message = new AppMessage("+1234567890", "Hello World");
        assertEquals("HELLO_WORLD", message.generateHash());

        AppMessage emptyContentMessage = new AppMessage("+1234567890", "");
        assertEquals("EMPTY_CONTENT", emptyContentMessage.generateHash());
    }

    @Test
    public void testSaveToFile() throws IOException {
        AppMessage message = new AppMessage("+1234567890", "Test message");
        String filename = "testMessage.json";
        
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }

        message.saveToFile(filename);
        
        assertTrue(file.exists());
        
        file.delete();
    }
}
