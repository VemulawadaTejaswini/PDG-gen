import java.util.*;
public class Main {
		public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
				int q =sc.nextInt();
				int a[] = new int[q];
				int b[] = new int[q];
				double c[] = new double[q];
				int count[] = new int[q];
				int i = 0;
				for(;i <= q - 1;i++){
						a[i] = sc.nextInt();
						b[i] = sc.nextInt();
						c[i] = a[i] * b[i];
						count[i] = 0;
				}
				for(i = 0;count[i] < Math.sqrt(c[i]);count[i]++){
						System.out.println(count[i]);
				}
		}
}
