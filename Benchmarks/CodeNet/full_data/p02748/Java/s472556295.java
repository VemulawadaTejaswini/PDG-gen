import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A];
		int[] b = new int[B];
		int amin = 100000 , bmin = 100000;
		int pricemin = 0;

		for(int i=0; i<A; i++){
			a[i] = sc.nextInt();
			if(a[i]<amin){
				amin = a[i];
			}
		}

		for(int i=0; i<B; i++){
			b[i] = sc.nextInt();
			if(b[i]<bmin){
				bmin = b[i];
			}
		}
		pricemin = amin+bmin;

		for(int i=0; i<M; i++){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int c = sc.nextInt();
			int price = a[x-1]+b[y-1]-c;
			if(price<pricemin){
				pricemin = price;
			}
		}

		System.out.println(pricemin);
	}
}
