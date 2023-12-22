import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        boolean can = false;
        for (int i=1; i<10; i++) {
            for (int j=1; i*j<=n&&j<10;  j++) {
                if(i*j!=n){
                    continue;
                }
                can = true;
                break;
            }
            if(!can) {
                continue;
            }
            break;
        }
        if(can){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
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