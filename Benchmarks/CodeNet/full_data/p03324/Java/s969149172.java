import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値
		int d = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		if(d==0 && n!=100) {
		    System.out.println(n);
		}else if(d==0 && n==100) {
			System.out.println(n+1);
		}
		if(d==1&& n!=100) {
			System.out.println(n*100);
		}else if(d==1 && n==100) {
			System.out.println((n+1)*100);
		}
		if(d==2&& n!=100) {
		    System.out.println(n*10000);
		}else if(d==2 && n==100) {
			System.out.println((n+1)*10000);
		}
     }
}