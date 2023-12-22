
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        //String N  = String.valueOf((int)(Math.pow(10, 5)));//scan.next();
	        for(int i=1 ; i<=(int)Math.pow(10, 5); i++) {
	        	String N = String.valueOf(i);
	        	//23456
	        //123456
	        long sum = 0L;
	        if(N.length() ==1) {
	        	System.out.println(N);
	        	continue;//return;
	        }
	        if(N.length()%2 ==1) {
	        	//sum += Integer.parseInt( N.substring(1, N.length()))+1;
	        	sum += Long.parseLong( N.substring(1, N.length()))+1  + (Long.parseLong( N.substring(0, 1))-1)* (long)Math.pow(10, N.length()-1);
	        }

	        long n = Long.parseLong(N)/10;

	        while(n>0) {
	        	int digit = String.valueOf(n).length();
	        	if(digit % 2 ==1) {
	        		sum+= (long)(Math.pow(10, digit) - Math.pow(10, digit-1) );
	        	}
	        	n /=10;

	        }
	       	System.out.print(i + ": ");

	       	System.out.println(sum);
	        }
	       	scan.close();
	}
}
