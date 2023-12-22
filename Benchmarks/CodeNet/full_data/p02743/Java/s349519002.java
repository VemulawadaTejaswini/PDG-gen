import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
        if(c-(a+b)>2*Math.sqrt(a*b)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}