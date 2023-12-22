import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] base = sc.nextLine().split(" "); //[A, B, C, X, Y];
        final int A = parseInt(base[0]);
        final int B = parseInt(base[1]);
        final int C = parseInt(base[2]);
        int X = parseInt(base[3]);
        int Y = parseInt(base[4]);
        
        if (useCpizza(A, B, C)) {
        	int totalCost = 0;
        	
        	while (X > 0 && Y > 0) {
        		totalCost += C * 2;
        		X--;
        		Y--;
        	}
        	
        	if(isBetterThan(A, C)) {
            	while (X > 0) {
            		totalCost += C * 2;
            		X--;
            	}
        	}

        	
        	if (isBetterThan(B, C)) {
            	while (Y > 0) {
            		totalCost += C * 2;
            		Y--;
            	}
        	}

        	System.out.print(totalCost + (A * X) + (B * Y));
        } else {
            System.out.println((X * A) + (Y * B));
        }
        

    }
    
    /**
     * Cピザが利用する価値があるかを判定
     * @param A
     * @param B
     * @param C
     * @return
     */
    public static boolean useCpizza(int A, int B, int C) {
    	return (A + B) > (C * 2);
    }
    
    /**
     * 対象を利用するよりCを利用したほうが安いか判定
     * @param target
     * @param C
     * @return
     */
    public static boolean isBetterThan(int target, int C) {
    	return target > (C * 2);
    }
}