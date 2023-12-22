import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long x = sc.nextLong();
        long eatp = 0;
        long eati = n;
        for (long i = n; i > 0; i--) {
            if ((eati - i) + Math.pow(2, i + 2) - 3 <= x) {
                eatp += Math.pow(2, i + 1) - 1;
                x -= (eati - i) + Math.pow(2, i + 2) - 3;
                eati = i;
                if (x == 0) {
                    break;
                } else {
                    x--;
                    eatp++;
                }
            }
        }
        if (n == 1) {
            if (x == 1) {
                eatp = 0;
            } else if (x == 2) {
                eatp = 1;
            } else if (x == 3) {
                eatp = 2;
            } else if (x == 4 || x == 5) {
                eatp = 3;
            }
        } else if (eati == n) {
            
        }else {
            x -= eati - 1;
            if (x == 2) {
                eatp++;
            } else if (x == 3) {
                eatp += 2;
            } else if (x >= 4) {
                eatp += 3;
            }
        }
        System.out.println(eatp);
    }
}