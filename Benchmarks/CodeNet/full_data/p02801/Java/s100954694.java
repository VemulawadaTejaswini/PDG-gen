import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = "abcdefghijklmnopqrstuvwxyz";
        String c = sc.next();
        System.out.println(s.charAt(s.indexOf(c)+1));
    }
}