//package atCoder;
//package atCoder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        
        long[] arr = new long[a];
        for(int i = 0; i < a; i++)
        {
            arr[i] = scan.nextLong();
        }
        
        long sum2 = 0;
        for(int i = 0; i < a; i++)
        {
            for(int j = i+1; j < a; j++)
            {
                //System.out.println(i + "," + j);
                //System.out.println(Long.toBinaryString(arr[i]));
                //System.out.println(Long.toBinaryString(arr[j]));
                //sum+= x;
                //System.out.println(x);
                sum2+= arr[i] ^ arr[j];
                System.out.println(sum2);
                
            }
        }
        
        System.out.println(sum2%1000000007);
        scan.close();
    }

}
