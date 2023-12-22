import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        long aMin = a[0];
        long bMin = b[0];

        for (int i = 0; i < n; i++) {
            bMin = b[i];
            aMin = a[i];
            for (int j = i+1; j < n; j++) {
                if (bMin > b[j]) {
                    b[i] = b[j];
                    b[j] = bMin;
                    bMin = b[i];
                    a[i] = a[j];
                    a[j] = aMin;
                    aMin = a[i];
                }
            }
        }

        long time = 0;
        long judge = 0;

        for (int i = 0; i < n; i++) {
            time += a[i];
            if (time > b[i]) {
                judge++;
            }
            // System.out.println(i + " , " + a[i] + " , " + time + " , " + b[i]);
        }

        if (judge == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
	}
}
