import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = 0,y=B;
	for(x=1;x<C;x++) {
		if(y<=A)break;
		y=y-A;
	}
	System.out.println(x);
	}
}