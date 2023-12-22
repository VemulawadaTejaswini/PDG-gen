import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);
        String s1, s2, s3;
        char l1, l2, l3;

        s1 = sc.next().toUpperCase();
        s2 = sc.next().toUpperCase();
        s3 = sc.next().toUpperCase();

        l1 = s1.charAt(1);
        l2 = s2.charAt(1);
        l3 = s3.charAt(1);

        out.println(l1+l2+l3);
        
        sc.close();
    }
}