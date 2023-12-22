import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        //START

        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        if(N%2==0){
            System.out.println("0.5000000000");
        }else{
            int s=N/2+1;
            double ans=(double)s/N;
            System.out.println(String.format("%.10f", ans));
        }

        //END
    }
}

