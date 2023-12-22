import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a =	sc.nextInt();
		int b =	sc.nextInt();
		int c =	sc.nextInt();
		int d =	sc.nextInt();

		if(b < c){
			System.out.println(0);
		}else if(c<=b && b<=d){
			System.out.println(b-c);
		}else if(d<b && a<=c){
			System.out.println(d-c);
		}else if(b<d && c<=a){
			System.out.println(b-a);
		}

		sc.close();
	}
}