import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int on = Math.max(A,C);
        int off = Math.min(B,D);
        System.out.println(Math.max(0,off-on));
    }
}