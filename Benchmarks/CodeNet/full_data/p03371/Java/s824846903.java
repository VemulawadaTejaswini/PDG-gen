import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A,B,C,X,Y;
	A=sc.nextInt();
	B=sc.nextInt();
	C=sc.nextInt();
	X=sc.nextInt();
	Y=sc.nextInt();
	C*=2;
	if(C>=A+B) {
		System.out.println(A*X+B*Y);
	}else {
		int min=X>Y?Y:X;
		int result=0;
		result+=(min*C);
		if(X==Y) {
			System.out.println(result);
		}else if(X>Y) {
			int cha=X-Y;
			if(C<A) {
				result+=(C*cha);
				System.out.println(result);
			}else {
				result+=(A*cha);
				System.out.println(result);
			}
		}else if(X<Y) {
			int cha=Y-X;
			if(C<B) {
				result+=(C*cha);
				System.out.println(result);
			}else {
				result+=(B*cha);
				System.out.println(result);
			}
		}
	}
	
	
}
}
