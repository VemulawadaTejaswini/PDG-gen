import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 3;
		if(a==b)cnt--;
		if(b==c)cnt--;
		if(a==c)cnt--;
		if(a==b&&b==c)cnt++;
		System.out.println(cnt);
	}
}