/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
	     Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    //String ss=s.next();
    long sum=0;
    for(int i=1;i<=n;i++){
        if(i%3!=0&i%5!=0)
        sum+=i;
    }
    //if(ss.contains("7"))
    System.out.println(sum);
    
	}
}