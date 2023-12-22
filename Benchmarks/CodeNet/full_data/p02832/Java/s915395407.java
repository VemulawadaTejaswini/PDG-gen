import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int t = 1;
    	int can = 0;
    	for(int i=0;i<n;i++) {
    		int m = sc.nextInt();
    		if(m==t) {
    			can++;
    			t++;
    		}
    	}
    	int sum = can==0?-1:n-can;
    	System.out.println(sum);
	}
}