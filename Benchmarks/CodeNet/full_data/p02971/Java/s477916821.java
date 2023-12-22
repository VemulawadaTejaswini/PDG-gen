import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer n = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] idx = new Integer[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        Arrays.setAll(idx, i -> i);
        Arrays.sort(idx, Comparator.comparingInt(i -> a[i]));
        
        for(int i = 0; i < n; i++){
            if(i == idx[n-1]){
                System.out.println(a[idx[n-2]]);
            } else {
                System.out.println(a[idx[n-1]]);
            }

        }


    }
}