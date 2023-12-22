import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import  java.io.*;
import  java.math.*;
import java.nio.Buffer;
import java.sql.SQLSyntaxErrorException;
import  java.util.*;
import  java.text.*;
import java.util.stream.Collectors;


public class Main {

    public static int gcd(int n,int m){
        return (m==0)?n:gcd(m,n%m);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        long n=cin.nextLong();
        long m=cin.nextLong();
        if(n==1||m==1){
            System.out.println("1");
        }
        else{
            if(n*m%2==1){
            System.out.println(n*m/2+1);
            }
            else{
                System.out.println(n*m/2);
            }
        }
    }

}

