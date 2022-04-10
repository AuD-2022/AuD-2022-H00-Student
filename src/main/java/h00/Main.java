package h00;

/**
 * Main entry point in executing the program.
 */
public class Main {

    /**
     * Main entry point in executing the program.
     *
     * @param args program arguments, currently ignored
     */
    public static void main(String[] args) {
        var list = new ListItem<String>();
        list.key = "Hello";
        list.next = new ListItem<String>();
        list.next.key = "World";
        System.out.println(list);
    }
}
