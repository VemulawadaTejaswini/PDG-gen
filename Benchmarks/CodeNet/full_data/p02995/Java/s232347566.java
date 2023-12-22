import java.util.Scanner;

class Main {

    public static long calc(long A, long B, long X) {
	long A_count = (A - 1) / X;
	long B_count = B / X;

	if (B_count - A_count == 0)
	    return 1;
	else
	    return (B_count - A_count);
    }
    
    public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);

	long A, B, C, D;
	A = sc.nextLong();
	B = sc.nextLong();
	C = sc.nextLong();
	D = sc.nextLong();

	long C_count = B - A - calc(A, B, C) + 1;
	long D_count = B - A - calc(A, B, D) + 1 ;
	long CD_count = B - A -calc(A, B, C * D) + 1;

	System.out.println(C_count + D_count - CD_count);
    }
}