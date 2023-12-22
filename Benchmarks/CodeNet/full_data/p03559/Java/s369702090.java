import java.util.*;

public class Main {

   static Scanner in = new Scanner(System.in);
	int[] a, b, c;
   void solve() {
	int n = in.nextInt();
	a = new int[n]; b = new int[n]; c = new int[n];
	for(int i = 0; i < n; i++) a[i] = in.nextInt();
	for(int i = 0; i < n; i++) b[i] = in.nextInt();
	for(int i = 0; i < n; i++) c[i] = in.nextInt();
	Arrays.sort(a); Arrays.sort(b); Arrays.sort(c);
	int sum = 0;
	for(int i = 0; i < n; i++){
		//System.out.println(sertch(a, b[i]));
		int t = Math.abs(sertch(a, b[i]));
		int s = sertch(c, b[i]);
		//System.out.println(s);
		s = s <= 0 ? n + s : n - s - 1; 
		//System.out.println(b[i] + " : " + t + " " + s);
		sum += s * t;
	}
	System.out.println(sum);
   }

   int sertch(int[] x, int key){
	   int left = 0, right = b.length;
		// System.out.print(key + ":");
	   while(left < right){
			int mid = (left + right) / 2;
			// System.out.print("mid " + mid + " ");
			if(x[mid] == key) return mid;
			else if(key < x[mid]) right = mid;
			else left = mid + 1;
	   }
	   return -1 * left;
   }
   
   public static void main(String[] args) {
	   new Main().solve();
   }
}