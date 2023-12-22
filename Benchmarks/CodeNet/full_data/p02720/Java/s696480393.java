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
    public static boolean pan(long a){
        long x,y;
        x=a%10;
        a=a/10;
        while(a>0){
            y=a%10;
            if(Math.abs(x-y)>1){
                return false;
            }
            x=y;
            a=a/10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long[] num= new long[1000010];
        for(int i = 1; i <= 9; i++){
            num[i] = i;
        }
        int cnt=10;
        int x=0;
        for(int i=1; i<=9; i++){
            long d = num[i]%10;
            if(d == 0){
                num[cnt++]=num[i]*10;
                num[cnt++] =num[i]*10+1;
                x+=2;
            }
            else if(d==9){
                num[cnt++]=num[i]*10+8;
                num[cnt++] =num[i]*10+9;
                x+=2;
            }
            else{
                num[cnt++]=num[i]*10+d-1;
                num[cnt++]=num[i]*10+d;
                num[cnt++]=num[i]*10+d+1;
                x+=3;
            }
        }
        int l=10,r=10+x;
        x = 0;
        for(int i = l; i <= r; i++){
            long d = num[i]%10;
            if(d == 0){
                num[cnt++]=num[i]*10;
                num[cnt++]=num[i]*10+1;
                x+=2;
            }
            else if(d==9){
                num[cnt++] =num[i]*10+8;
                num[cnt++] =num[i]*10+9;
                x+=2;
            }
            else{
                num[cnt++]=num[i]*10+d-1;
                num[cnt++]=num[i]*10+d;
                num[cnt++] =num[i]*10+d+1;
                x+=3;
            }
        }
        for(int k = 1; k <= 7; k++){
            l = r+1;
            r = l+x;
            x = 0;
            for(int i = l; i <= r; i++){
                long d = num[i]%10;
                if(d == 0){
                    num[cnt++]=num[i]*10;
                    num[cnt++]=num[i]*10+1;
                    x+=2;
                }
                else if(d==9){
                    num[cnt++]=num[i]*10+8;
                    num[cnt++] =num[i]*10+9;
                    x+=2;
                }
                else{
                    num[cnt++]=num[i]*10+d-1;
                    num[cnt++]=num[i]*10+d;
                    num[cnt++]=num[i]*10+d+1;
                    x+=3;
                }
            }
        }
        int n = cin.nextInt();
        System.out.println(num[n]);


    }
}