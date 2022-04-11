package h00;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Public Tests")
public class PublicTests {

    @Test
    @DisplayName("H1")
    public void test() {
        // create list items
        ListItem<String> head = new ListItem<>();
        head.next = new ListItem<>();
        head.next.next = new ListItem<>();
        head.next.next.next = new ListItem<>();
        // set keys
        head.key = "this";
        head.next.key = "is";
        head.next.next.key = "a";
        head.next.next.next.key = "test";
        // test
        String string = assertDoesNotThrow(head::toString);
        assertEquals("(this is a test)", string);
    }
}
