import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int fh=x/500;
		int f=(x%500)/5;
		System.out.println(fh*1000+f*5);
	}
}
