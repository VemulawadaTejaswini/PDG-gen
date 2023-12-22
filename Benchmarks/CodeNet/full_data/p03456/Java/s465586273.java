import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int n = Integer.parseInt(a+b);
		boolean bl = false;
		for(int i=1; i*i<=n; i++){
			if(i*i==n){
				bl = true;
				break;
			}
		}
		System.out.println(bl==true ? "Yes" : "No");
	}
}