import java.util.*;
 
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        int h[] = new int[N];
        for (int i = 0; i < N; i++) {
        	x[i] = sc.nextInt();
        	y[i] = sc.nextInt();
        	h[i] = sc.nextInt();
        }
        
        for (int Cx = 0; Cx <= 100; Cx++) {
            for (int Cy = 0; Cy <= 100; Cy++) {
            	int kh = -1;
            	boolean yn = true;
            	for (int i = 0; i < N; i++){
            		if (h[i] == 0) {
            			continue;
            		}
            		int eh = h[i] + Math.abs(x[i] - Cx) + Math.abs(y[i] - Cy);
            		if (kh == -1) {
            			kh = eh;
            		} else if (kh != eh) {
            			yn = false;
            			break;
            		}
            	}
            	if (yn == false) {
            		continue;
            	} else {
            		System.out.printf("%d %d %d", Cx, Cy, kh);
            	}
            }
        }
    }
}