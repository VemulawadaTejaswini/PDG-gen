import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = readLine();
        String[] arg = input.split(" ");

        byte A = Byte.parseByte(arg[0]);
        byte B = Byte.parseByte(arg[1]);

        byte Result = (byte)(A - (B*2));
        if (Result < 0) Result = 0;
        Print(Result);

    }

    private static final Scanner __in = new Scanner(System.in);
    private static String readLine() {
        return __in.nextLine();
    }

    private static void Print(byte m) {
        System.out.println(m);
    }
}
