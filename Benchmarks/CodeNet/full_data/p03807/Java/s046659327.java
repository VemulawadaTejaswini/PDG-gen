//package grand_04_02_17;

import java.util.Scanner;

/**
 * Created by srikanth on 04-02-2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int even=0,odd=0;
        int N=scan.nextInt();
        long sum=0;
        while(N-->0){
            int i=scan.nextInt();
            sum+=i;
           
        }

        System.out.println((int)1e9>Integer.MAX_VALUE);
        System.out.println(sum%2==0?"YES":"NO");
    }
}
