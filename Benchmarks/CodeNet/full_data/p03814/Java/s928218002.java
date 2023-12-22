
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = in.nextLine();
        int size = input.codePointCount(0, input.length());

        boolean started = false;
        int count = 0;
        int result = 0;
        for(int i = 0; i < size; i++) {
            int c = input.codePointAt(i);


            count += 1;
            switch (c) {
                case 'A':
                    if (!started) {
                        count = 1;
                    }
                    started = true;
                    break;
                case 'Z':
                    result = count;
                    break;
            }
        }
        out.print(result);
    }
    public static final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    public static final PrintStream out = System.out;
}
