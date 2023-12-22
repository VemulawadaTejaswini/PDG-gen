import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[n];
        for(int i = 0; i < n-1; i++) li[sc.nextInt()-1]++;
        for(int i : li) System.out.println(i);
    }

}
