import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long p = 1;
	for(int i = 1; i <= n; i++) {
		p = (p * i) % ((int)Math.pow(10, 9) + 7);
	}
	System.out.println(p);
}
}
