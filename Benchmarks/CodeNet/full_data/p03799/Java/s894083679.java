

import java.util.Scanner;

/**
 * Created by srikanth on 18-02-2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
       int val=0;
       if(2*N<=M){
           val+=N;
           M-=2*N;
       }
       val+=(M/4);
        System.out.println(val);


    }
}
