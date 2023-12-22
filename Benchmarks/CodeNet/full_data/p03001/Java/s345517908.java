import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long w=sc.nextInt();
		long h=sc.nextInt();
		long x=sc.nextInt();
		long y=sc.nextInt();

		System.out.println(w*h*0.5+" "+(x*2==w&&y*2==h?1:0));

	}
		
}