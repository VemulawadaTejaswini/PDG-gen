import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        sc.close();
        if(str.substring(0,n/2).equals(str.substring(n/2))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}