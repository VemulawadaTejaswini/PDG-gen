import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		long x=sc.nextLong();
		long ans;
		if((x%11)>6){
			ans=(x/11)*2+2;
		}else{
			ans=(x/11)*2+1;
		}
		System.out.println(ans);
	}
}