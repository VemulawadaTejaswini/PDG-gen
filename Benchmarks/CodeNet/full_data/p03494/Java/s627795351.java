import java.util.*;
public class Main {
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = Integer.parseInt(sc.next());
      	int[] a = new int[n];
      	int count = 0;
				int num = 0;
        boolean f = true;
      	for (int i = 0; i < a.length; i++) {
					while (a[i]%2 == 0) {
						a[i] = a[i] / 2;
						num++;
					}
					a[i] = num;
				}
				count = Math.min(a);
     System.out.print(count);
   }
}
