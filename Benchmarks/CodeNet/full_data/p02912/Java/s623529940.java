import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        //int q = stdIn.nextInt();
        int num[] = new int[n];
        
        for(int i = 0; i < n; i++){
            num[i] = stdIn.nextInt();
        }
        
        sort(num, 0, n - 1);
        
        for(int i = 0; i < m; i++){
            num[n - 1] = num[n - 1] / 2;
            sort(num, 0, n - 1);
        }
        
        long sum = 0;
        for(int i = 0; i < n; i++){
            sum += num[i];
        }
        
        System.out.println(sum);
    }
    
    public static void sort(int[] array, int left, int right){
        if(left <= right){
            int p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l ++;
                }
                while (array[r] > p){
                    r --;
                }
                if (l <= r){
                    int tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++ ;
                    r-- ;
                }
            }
            Main.sort(array, left, r);
            Main.sort(array, l, right);
        }
    }
}
