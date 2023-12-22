import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = Integer.parseInt(sc.next());
        long B = Integer.parseInt(sc.next());
        long C = Integer.parseInt(sc.next());
        sc.close();

        if(A == B && B == C && C == A) {
            System.out.println("-1");
            return;
        }

        int count = 0;
        boolean isEven = true;
        while(isEven) {
        	if(A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {
        		long tmpA = A / 2;
        		long tmpB = B / 2;
        		long tmpC = C / 2;
        		A = B = C = 0;
        		A = tmpB + tmpC;
        		B = tmpC + tmpA;
        		C = tmpA + tmpB;
        		count++;
        	}else {
        		isEven = false;
        	}
        }
        System.out.println(count);
    }

}