import java.util.*;


public class Main {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		double H = sc.nextInt();
		double W = sc.nextInt();
		double r = H*W/2;
		r = Math.ceil(r);
		System.out.println((long)r);
	}	
}