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
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int max = Math.max(a, Math.max(b, c));
    if(max == a){
        System.out.println(max*10 + b + c);
    }else if(max == b){
        System.out.println(max*10 + a + c);
    }else{
        System.out.println(max*10 + b + c);
    }
    
    
	}
}