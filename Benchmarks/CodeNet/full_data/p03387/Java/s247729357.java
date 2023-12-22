import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int min = Math.min(Math.min(A,B),C);
	int max = Math.max(Math.max(A,B),C);
	A = A-min;
	B = B-min;
	C = C-min;
	max = max - min;
	int a = (max==A)?max-B: max-A;
	int b = (max==B)?max-C: max-B;
	int ans = 0;
	if((a+b)%2!=0) {
	    ans = (a+b)/2+2;
	}else{
	    ans = (a+b)/2;
	}
	System.out.println(ans);

    }
}