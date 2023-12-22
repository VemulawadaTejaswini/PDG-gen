import java.io.Console;

public class Main {
    public static void main(String[] A00) {
    	Console console = System.console();
      char[] c = new char[1];
    	c[0] = console.readLine().toCharArray();
    	System.out.println(++c[0]);
    }
}
