import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int n=0;n<N;n++) a[n]=sc.nextInt();
        	
        Arrays.sort(a);
        //maximize nCr
        //when r is fixed, the best n is the largest one
        int left = a[N-1];
        //the best r is the closest to n/2
        int right = -1;
        for(int n=0;n<N-1;n++){
        	if(Math.abs(right-left/2.0) > Math.abs(a[n]-left/2.0)) right = a[n];
        }
        
        System.out.println(left+" "+right);
        
    }
}