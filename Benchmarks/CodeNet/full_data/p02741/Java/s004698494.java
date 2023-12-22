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
        int[] num=new int[32];
        //1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2,
        // 1\23, 15\24, 2, 2, 5, 4\28, 1\29, 4\30, 1\31, 51\32
        int n=cin.nextInt();
        if(n==1||n==2||n==3||n==5||n==7||n==11||n==13||n==15||n==17||n==19||n==23||n==29||n==31){
            System.out.println("1");
        }
        else if(n==4||n==6||n==9||n==10||n==14||n==21||n==22||n==25||n==26){
            System.out.println("2");
        }
        else if(n==8||n==12||n==18||n==20||n==27){
            System.out.println("5");
        }
        else if(n==28||n==30){
            System.out.println("4");
        }
        else if(n==16){
            System.out.println("14");
        }
        else if(n==24){
            System.out.println("15");
        }
        else if(n==32){
            System.out.println("51");
        }
    }

}

