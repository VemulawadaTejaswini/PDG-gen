import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        System.out.print(String.valueOf(s.charAt(0)));
        System.out.print(len-2);
        System.out.print(String.valueOf(s.charAt(len-1)));
    }
}