import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		int count = 1;
		int mult = x * y * z;
		Long[] a = new Long[x];
		Long[] b = new Long[y];
		Long[] c = new Long[z];

		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextLong();
		}
		Arrays.sort(a, Collections.reverseOrder());
		
		for(int i = 0; i < b.length; i++){
			b[i] = sc.nextLong();
		}
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i = 0; i < c.length; i++){
			c[i] = sc.nextLong();
		}
		Arrays.sort(c, Collections.reverseOrder());

		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < b.length; j++){
				for(int kk = 0; kk < c.length; kk++){
					if(k < count){
						return;
					}
					System.out.println(a[i] + b[j] + c[kk]);
					count++;
				}
			}
		}
	}
}