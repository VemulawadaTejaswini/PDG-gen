import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = sc.nextInt();
        int l = s.length();
        
        for(int i=0;i<l;i+=w) System.out.print(s.charAt(i));
        System.out.println();
    }
}