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

        boolean check = true;

        for(long i = 0; i < k ; i++){
            if(a != 0){
                a = a - 1;
            }else if(b != 0){
                b = b - 1;
            }else if(a == 0){
                check = false;
                //count = a + b;
            }else{
                check = false;
                //count = a + b;
            }
        }

        System.out.print(a + " " + b);
    
	}
}