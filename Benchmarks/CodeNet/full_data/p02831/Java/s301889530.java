import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	int i=sc.nextInt(),j=sc.nextInt();
    	System.out.println(i*j/gcd(i,j));
	}
	public static int gcd(int i,int j) {
		if(j==0)
			return i;
		else
			return gcd(j,i%j);
	}
}