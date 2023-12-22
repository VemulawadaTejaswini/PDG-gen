import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long k=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong();
		sc.close();
		if(a<b) { //交換
			if(k<a) {
				System.out.println(k+1);
			}else if((k-a+1)%2==0) {
				if((k-a+1)/2==1) System.out.println(b-a);
				else System.out.println(b*((k-a+1)/2)-a*((k-a+1)/2-1));
			}else {
				if((k-a+1)/2==0) System.out.println(a+1);
				else if((k-a+1)/2==1) System.out.println(b+1);
				else System.out.println(b*((k-a+1)/2-1)-a*((k-a+1)/2-2)+1);
			}
		}else { //叩く
			System.out.println(k++);
		}
	}
}