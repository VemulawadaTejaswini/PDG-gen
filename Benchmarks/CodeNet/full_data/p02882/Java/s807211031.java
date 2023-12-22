import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.next());
        double b = Double.parseDouble(sc.next());
        double x  = Double.parseDouble(sc.next());

        double degree;
        if(x<(0.5*a*a*b)) {
            degree  = Math.toDegrees(Math.atan((a*b*b)/(2*x)));
        }else if(x>(0.5*a*a*b)){
            degree = Math.toDegrees(Math.atan((2*a*a*b - 2*x)/(a*a*a)));
        }else{
            degree = Math.toDegrees(Math.atan(b/a));
        }
        System.out.println(degree);
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