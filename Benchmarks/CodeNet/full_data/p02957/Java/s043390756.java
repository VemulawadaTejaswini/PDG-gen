import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a =sc.nextLong();
		long b = sc.nextLong();
		if(Math.abs(a-b)%2==0){
			long k=Math.abs(a-b)/2;
			if(a<b){
				System.out.println(k+a);
			}else{
				System.out.println(k+b);
			}
		}else{
			System.out.println("IMPOSSIBLE");
		}
	}
}
