package ua.lviv.iot.lab6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RedactorTest {
    private Redactor redactor;

    @BeforeEach
    public void createRedactor() {
        redactor = new Redactor();
    }

    @Test
    public void testRemoveArticle() {
        String textToCheck = "we just go to the class. in the end of a classroom is an elephant";
        assertEquals("we just go to class. in end of classroom is elephant",
                redactor.removeArticle(textToCheck));
    }

    @Test
    public void testRemovePreposition() {
        String textToCheck = "we just go to the class. in the end of a classroom is an elephant";
        assertEquals("we just go to the class. the end of a classroom is an elephant",
                redactor.removePrepositions(textToCheck));
    }

    @Test
    public void testScanConsole() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String textFromConsole = scanner.nextLine();
            redactor.removeArticle(redactor.removePrepositions(textFromConsole));
        }
        scanner.close();
    }

}
