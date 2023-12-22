import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        
        long min = Long.MAX_VALUE;
        for(long i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                long length = i + (n/i) -2;
                min = Math.min(length, min);
            }
        }
        System.out.println(min);
    }
    
    private static void sort(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left+right)/2];
        int l=left, r=right;
        int tmp;
        while(l<=r){
            while(d[l]>p){l++;}
            while(d[r]<p){r--;}
            if(l<=r){
                tmp=d[l];
                d[l] = d[r];
                d[r] = tmp;
                l++; r--;
            }
        }
        sort(d, left, r);
        sort(d, l, right);
    }
}