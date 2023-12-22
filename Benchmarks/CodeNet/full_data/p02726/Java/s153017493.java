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


    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        int x=cin.nextInt();
        int y=cin.nextInt();
        int sum[]=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                if(i==x&&j==y){
                    sum[1]++;
                }
                else{
                    if(j>=y){
                        //System.out.println(i+" "+j);
                        int ant=Math.min(Math.abs(Math.abs(x-i)+1+j-y),j-i);
                        if(ant==5){
                            System.out.println(i+" "+j);
                        }
                        sum[ant]++;
                    }
                    else {
                       int cnt=Math.min(Math.abs(Math.abs(x-i)+1+Math.abs(j-y)),j-i);
                        sum[cnt]++;
                    }
                }
            }
        }
        for(int i=1;i<n;i++){
            System.out.println(sum[i]);
        }

    }
}
