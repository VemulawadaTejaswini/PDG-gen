import java.util.*;
import java.lang.*;
import java.io.*;

public class JavaApplication2 {


    public static void main (String[] args) {
        Scanner key = new Scanner(System.in);
        int A = key.nextInt();
        int B = key.nextInt();
        int C = key.nextInt();
        int maximum = A+B*10+C;
        System.out.println(maximum);
    }
}