import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int xa = Math.abs(x-a);
        int xb = Math.abs(x-b);
        if (xa<xb)
            System.out.println("A");
        else
            System.out.println("B");
    }
}
