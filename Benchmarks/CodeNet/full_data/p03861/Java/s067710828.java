import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong(),b=sc.nextLong(),x=sc.nextLong();
		System.out.println(a<b&&a!=0?(b-b%x)/x-(a+x-a%x)/x+1:a<b&&a==0?(b-b%x)/x-(a+x-a%x)/x+2:0);
		sc.close();
	}
}