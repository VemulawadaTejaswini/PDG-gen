import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int h = 0;

        for (int i = 0; i<n.length(); i++){
            int cu = Integer.parseInt(String.valueOf(n.charAt(i)));
            if (cu > h){
                h = cu;
            }
        }
        for (int i = 0; i<n.length();i++)
            System.out.print(h);
    }
}