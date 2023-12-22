import java.util.*;
 
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int p[] = new int[n];
        int p_copy[] = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        if (isIncrease(p)) {
            System.out.println("YES");
        } else {
            boolean canSwap = false;
            for (int i = 0; i < n-1; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        p_copy[k] = p[k];
                    }
                    int dummy = p_copy[i];
                    p_copy[i] = p_copy[j];
                    p_copy[j] = dummy;
                    if (isIncrease(p_copy)) {
                        canSwap = true;
                    }
                }
            }
            if (canSwap) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    static boolean isIncrease(int p[]) {
        for (int i = 0; i < p.length - 1; i++) {
            if (p[i] > p[i+1]) {
                return false;
            }
        }
        return true;
    }

}
