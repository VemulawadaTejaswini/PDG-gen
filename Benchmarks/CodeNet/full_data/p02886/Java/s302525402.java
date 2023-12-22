import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i=0;i<n;i++){
            d[i] = Integer.parseInt(sc.next());
        }

        int sum = 0;
        for(int i=0;i<n-1;i++){
            int a = d[i];
            for(int j=i+1;j<n;j++){
                int b = d[j];
                sum += a*b;
            }
        }
        
        System.out.println(sum);
        
    }

    private static char[] rotateArray(char[] c, int d){
        char[] newc = new char[c.length];
        for(int i=0;i<c.length;i++){
            newc[(i+d)%c.length] = c[i];
        }
        return newc;
    }
    
    private static void sort(int[] d, int left, int right){
        if(left>=right){return;}
        int p = d[(left+right)/2];
        int l=left, r=right;
        int tmp;
        while(l<=r){
            while(d[l]<p){l++;}
            while(d[r]>p){r--;}
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