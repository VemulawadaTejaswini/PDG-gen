import java.util.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=n-999;
		System.out.println(n<=9?"ABC00"+n:n<=99?"ABC0"+n:n<=999?"ABC"+n:n-999<=9?"ABD00"+b:n-999<=99?"ABD0"+b:n<=999?"ABD"+b:"");
	}
}
