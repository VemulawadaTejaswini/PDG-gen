import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c=b;
		if(b<0){
			c*=-1;
		}
		
		c+=a;//和ここにいれる
		a*=b;//積ここに入れる
		if(c>a){a=c;}
		
		System.out.println(a);
	}
}