import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	long a = sc.nextLong();
      	if(a == 0) a = 1;
      	long b = sc.nextLong();
      	if(b == 0) b = 1;
      	long x = sc.nextLong();
      	long ans = b / x - (a - 1) / x;
		System.out.println(ans);
	}
}
