import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long m=sc.nextInt();
		long count=0;
		if(2*n<=m){
		m+=2*n;
		count+=m/4;
		}else{
			count=m/2;
		}
		System.out.println(count);
	}
}