import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0;i<N;i++)a[i]=sc.nextInt();
        
        if(N%2==0){
        	for(int i=N-1;i>=0;i-=2)System.out.println(a[i]);
        	for(int i=0;i<N;i+=2)System.out.println(a[i]);
        }else{
        	for(int i=N-1;i>=0;i-=2)System.out.println(a[i]);
        	for(int i=1;i<N;i+=2)System.out.println(a[i]);
        }
    }
}