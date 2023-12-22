import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        Long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong();
        if((c-(a+b))/4*(c-(a+b))>a*b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}