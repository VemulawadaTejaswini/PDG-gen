package spring21;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt(),b=sc.nextInt(),x=sc.nextInt(),c=0;
		c=b/x-a/x;
		if(a%x==0){
			c++;
		}
		System.out.println(c);
	}
}