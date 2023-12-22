import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        if(Math.pow(c-(a+b),2)>4*a*b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}