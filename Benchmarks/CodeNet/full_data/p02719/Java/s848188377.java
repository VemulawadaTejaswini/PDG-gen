import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        if(n%k==0){
            System.out.println("0");
        }
        else{
            while(n>abs(n-k)){
                n=abs(n-k);
            }
            System.out.println(n);
        }


    }
}
