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
    long n = sc.nextLong();
    double a = Math.sqrt(n);

    //System.out.println(a);
    for(int i = (int)a; i > 0 ; i--){
        if(n % i == 0){
            System.out.println(i + (n/i) - 2);
            System.exit(0);
        }
    }
    
    
	}
}