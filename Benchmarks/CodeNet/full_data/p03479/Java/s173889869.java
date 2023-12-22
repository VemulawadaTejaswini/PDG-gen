import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long x = sc.nextLong();
	long y = sc.nextLong();
	long ans = 1;
	while(2*x<=y) {
		x *= 2;
		ans = x;
	}
	System.out.println(ans);
}
}