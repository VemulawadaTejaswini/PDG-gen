import java.io.*;

public class Main {

    public static String main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        return (a * b) % 2 == 0 ? "Even" : "Odd";
    }

}
