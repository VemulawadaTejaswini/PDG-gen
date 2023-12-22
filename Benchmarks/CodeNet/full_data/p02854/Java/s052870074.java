import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
        public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = stdIn.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n;i++){
            sum += a[i];
        }
        int sum2 = 0;
        for(int i = 0; i < n;i++){
            sum2 += a[i];
            if(sum2*2 >= sum){
                if(sum2*2 == sum){
                    System.out.println(0);
                    System.exit(0);
                }else{
                    System.out.println(Math.abs((sum-sum2)-sum2));
                    System.exit(0);
                }
            }
        }
        
    }
}