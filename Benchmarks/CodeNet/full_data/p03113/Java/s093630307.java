import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean fa = false;
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            a[i] = sc.nextInt();
            if(k >= a[i]){
                fa = true;
            }
        }
        sc.close();
        if(fa){
            System.out.println(-1);
        }else{
            for(int i = 0 ; i < k ; i++){
                for(int j = 0 ; j < n ; j++){
                    System.out.print(j + 1);
                    if(i * j == k * (n - 1)){
                        System.out.println();
                    }else{
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}