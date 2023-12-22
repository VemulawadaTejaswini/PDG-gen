import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Main {
    public static boolean gcd(int a,int b){
        if(a==1||b==1){
            return false;
        }
        while(1>0){
            int t = a%b;
            if(t == 0){
                break;
            }
            else{
                a=b;
                b=t;
            }

        }
        if(b>1)	return true;
        else{
            return  false;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n=cin.nextLong();
        long k=cin.nextLong();
        if(n<k){
            HashMap<Long,Integer> p = new HashMap<Long,Integer>();
            long x=n%k;
            long minn=x;
            while(true){
                x=Math.abs(x-k);
                if(!p.containsKey(x)){
                    p.put(x, 1);
                    minn = Math.min(x, minn);
                }
                else break;
            }
            System.out.println(minn);
        }
        else if(n%k==0){
            System.out.println("0");
        }
        else{
            System.out.println(Math.abs(n%k-k));
        }

    }
}