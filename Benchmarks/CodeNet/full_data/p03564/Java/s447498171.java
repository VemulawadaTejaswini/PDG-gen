import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k = sc.nextInt();
	int cout = 0;
	int x = 1;
	while(x < k) {
		x *= 2;
		cout++;
		if(cout == n) {
			break;
		}
	}
	for(int i = cout + 1; i <= n; i++) {
		x += k;
	}
	System.out.println(x);
}
}