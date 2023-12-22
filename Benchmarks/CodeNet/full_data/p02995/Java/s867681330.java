import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong() - 1;
    long b = sc.nextLong();
    long c = sc.nextInt();
    long d = sc.nextInt();
    long final_a = 0;
    long final_b = 0;
    long ac = 0;
    long ad = 0;
    long bc = 0;
    long bd = 0;
    long acd = 0; 
    long bcd = 0;

    long cd = lcm(c, d);

    ac = a / c;
    ad = a / d;
    bc = b / c;
    bd = b / d;
    acd = a / cd;
    bcd = b / cd;

    final_a = a - ac - ad + acd;
    final_b = b - bc - bd + bcd;

    System.out.println(final_b - final_a);



    

    
    
    }
    
    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (long)(c/b);
    }
}