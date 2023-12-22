import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        //int q = stdIn.nextInt();
        List<Integer> num = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            num.add(stdIn.nextInt());
        }
        
        Collections.sort(num);
        
        for(int i = 0; i < m; i++){
            int a = num.get(n - 1);
            num.remove(n - 1);
            
            boolean flag = false;
            
            for(int j = n - 2; j >= 0; j--){
                if(a / 2 > num.get(j)){
                    //System.out.println(a / 2 + " " + num.get(j));
                    num.add(j + 1, a / 2);
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
                num.add(n - 1, a / 2);
            }
            
            // for(int j = 0; j < n; j++){
            //     System.out.println(num.get(j));
            // }
            
            // System.out.println();
            // System.out.println();
            // System.out.println();
        }
        
        long sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += num.get(i);
            // System.out.println(num.get(i));
        }
        
        System.out.println(sum);
        // long sum = 0;
        // for(int i = 0; i < n; i++){
        //     sum += num[i];
        // }
        
        // System.out.println(sum);
        
        // for(Iterator it = num.iterator(); it.hasNext();){
        //     System.out.println(it.next());
        // }
    }
    
    // public static void sort(int[] array, int left, int right){
    //     if(left <= right){
    //         int p = array[(left + right) >>> 1];
    //         int l = left;
    //         int r = right;
    //         while(l <= r){
    //             while (array[l] < p){
    //                 l++;
    //             }
    //             while (array[r] > p){
    //                 r--;
    //             }
    //             if (l <= r){
    //                 int tmp = array[l];
    //                 array[l] = array[r];
    //                 array[r] = tmp;
    //                 l++;
    //                 r--;
    //             }
    //         }
    //         Main.sort(array, left, r);
    //         Main.sort(array, l, right);
    //     }
    // }
}
