import java.util.Scanner;
import java.io.*;

public class Main{
    public static void main(String args[]){
        Scanner scan_A = new Scanner(System.in);
        int  str_A = scan_A.nextInt();

        Scanner scan_B = new Scanner(System.in);
        int str_B = scan_B.nextInt();

        Scanner scan_C = new Scanner(System.in);
        int str_C = scan_C.nextInt();

        int ans;
        int E = str_A - str_B;
        if(E < str_C ){
            ans = 0;
        }else{
           
            ans = str_C -E;
        }
       
               
        System.out.println(ans);
    }

}