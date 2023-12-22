import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        boolean flag=(l%2==0);
        for(int i=1;i<l;i+=2){
            if(!s.substring(i-1,i+1).equals("hi"))flag=false;
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}