//package javaapplication2;
import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        System.out.println(solve(A,B));
    }
    
    private static int solve(int A,int B){
        int i = 1;
        while(true){
            int crA  = consumptionRate(i,8);
            int crB  = consumptionRate(i,10);
            //System.out.println(i + " " + crA + " " + crB);
            if(crA == A && crB == B) return i;
            if(crA > A || crB > B) break;
            i++;
        }
        return -1;
    }
    
    private static int consumptionRate(int price,int percent){
        return (int)Math.floor((double)price * percent / 100.0);
    }
}
