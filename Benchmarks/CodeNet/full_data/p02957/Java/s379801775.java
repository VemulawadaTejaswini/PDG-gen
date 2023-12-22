import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		System.out.println((a+b)%2==0?(a+b)/2:"IMPOSSIBLE");
	}
}
