import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long x = sc.nextLong();
	long y = sc.nextLong();
	int ans = 0;
	for(int i=1; Math.pow(2, i-1)*x<=y; i++) {
		ans = i;
	}
	System.out.println(ans);
}
}
