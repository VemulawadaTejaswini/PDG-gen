import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        int N = 50;
        long a = K/N;
        long b = K%N;
        System.out.println(N);
        for(int i=0;i<N;i++){
        	if(i<N-b) System.out.print(N+a-1-b);
        	else System.out.print(2*N+a-b);
        	
        	if(i==N-1)System.out.println();
        	else System.out.print(" ");
        }
    }
}