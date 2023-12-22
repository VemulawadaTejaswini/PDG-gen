import java.io.Console;

public class Main {
    public static void main(String[] A00) {
    	Console console = System.console();
    	char[] c = console.readLine().toCharArray();
    	System.out.println(++c[0]);
    }
}