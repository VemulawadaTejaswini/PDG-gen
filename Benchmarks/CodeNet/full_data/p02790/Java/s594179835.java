import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] c = new String[2];
        String tmpa = "";
        for(int i = 0; i < b; i++){
            tmpa += String.valueOf(a);
        }
        c[0] = tmpa;
        String tmpb = ""; 
        for(int i = 0; i < a; i++){
            tmpb += String.valueOf(b);
        }
        c[1] = tmpb;
        Arrays.sort(c);
        System.out.println(c[0]);
    }
}