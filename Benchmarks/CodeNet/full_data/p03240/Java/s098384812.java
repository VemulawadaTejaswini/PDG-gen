import java.util.*;

 class Main {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int N = Integer.parseInt(sc.next());
 		int[] x = new int[N];
 		int[] y = new int[N];
 		int[] h = new int[N];
 		for (int i=0;i<N;i++) {
 			x[i] = Integer.parseInt(sc.next());
 			y[i] = Integer.parseInt(sc.next());
 			h[i] = Integer.parseInt(sc.next());
 		}

 		loop:for (int i=0;i<=100;i++) {
 			for (int j=0;j<=100;j++) {
 				int height = h[0]+Math.abs(x[0]-i)+Math.abs(y[0]-j);
 				for (int k=0;k<N;k++) {
 					int h_pred = h[k]+Math.abs(x[k]-i)+Math.abs(y[k]-j);
 					if (h[k]==0) {
 						if (height>h_pred) {
 							break;
 						}
 					} else {
	 					if (height!=h_pred) {
	 						break;
	 					}
 					}
 					if (k==N-1) {
 						System.out.println(i + " " + j + " " + height);
 						break loop;
 					}
 				}
 			}
 		}
 	}
 }