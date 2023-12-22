import  java.io.*;
import  java.math.*;
import  java.util.*;


public class Main {
    public static void main(String[] args) {
    	Scanner cin = new Scanner(System.in);
    	int n = cin.nextInt();
    	long sum = 0;
    	for(int i = 1; i <= n; i++){
    		if(i%3 != 0 && i%5 != 0) sum += 1L*i;
    	}
    	System.out.println(sum);
    }
}