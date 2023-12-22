import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int tc=1;
    static String[] s;
    
    public static long[] ila(String[] s){
        long[] array=new long[s.length];
        for(int i=0;i<array.length;i++){
            array[i]=Long.parseLong(s[i]);
        }
        return array;
    }
    public static void main(String[] args)throws IOException {
        //tc=Integer.parseInt(br.readLine());
        while(tc-->0){
            s=br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            int money=0;
            if(x==1){
                money+=300000;
            }else if(x==2){
                money+=200000;
            }else if(x==3){
                money+=100000;
            }
            if(y==1){
                money+=300000;
            }else if(y==2){
                money+=200000;
            }else if(y==3){
                money+=100000;
            }
            if(x==1 && y==1)
                money+=400000;
            System.out.println(money);
            
        }
    }
}