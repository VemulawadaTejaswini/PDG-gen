import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int minsub = 100000;
        for(int i=0;i<n-1;i++){
            int sumA = 0;
            int sumB = 0;
            for(int j=0;j<i+1;j++){
                sumA += array[j];
            }
            for(int j=i+1;j<n;j++){
                sumB += array[j];
            }
            int sub = (int)Math.abs(sumA - sumB);
            if(sub < minsub){
                minsub = sub;
            }
        }
        System.out.println(minsub);
    }
}