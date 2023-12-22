import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int max = num1+num2;
        if(max > num1 + num3)   max = num1 + num3;
        if(max > num2 + num1)   max = num2 + num1;
        if(max > num2 + num3)   max = num2 + num3;
        if(max > num3 + num1)   max = num3 + num1;
        if(max > num3 + num2)   max = num3 + num2;

         
        System.out.println(max);
    }
}