import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int a = cin.nextInt();
        int b = cin.nextInt();

        cout.println(a < b * 2 ? 0 : a - (b * 2));

        cout.close();
    }
}