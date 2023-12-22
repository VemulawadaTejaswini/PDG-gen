import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if((N%1000)%111==0 || (N/10)%111==0) System.out.println("Yes");
        else System.out.println("No");
    }
}