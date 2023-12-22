import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int x = 0,y=B;
		if((0<=A&&A<=100)&&(0<=B&&B<=100)&&(0<=C&&C<=100)) {
	for(x=1;x<C;x++) {
		if(y<=A)break;
		y=y-A;
	}
	System.out.println(x);
		}
	}
}