import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Main {
	public static void main(final String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        int count = 0;

            if(a >= k && b >= k){
                a = a - k;
                b = b - k;
            }else if(a < k && b < k){
                a = 0;
                b = 0;
            }else if(a >= k && b < k){
                a = a - k;
                b = 0;
            }else{
                a = 0;
                b = b - k;
            }

        System.out.print(a + " " + b);
    
	}
}