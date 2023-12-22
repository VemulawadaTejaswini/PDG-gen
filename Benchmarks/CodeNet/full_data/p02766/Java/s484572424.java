import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    int r = sc.nextInt();
    long r2 = r;
    int count = 1;
    boolean a = true;
    while(a==true){
        if(n >= r2){
            count++;
        }else{
            //count++;
            a = false;
        }
        r2 = r2 * r;
    }
    System.out.println(count);
    }
}