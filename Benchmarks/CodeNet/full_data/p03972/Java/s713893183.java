import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int[] costp = new int[w];
		int[] costq = new int[h];
		long cost = 0;

		for(int i=0; i<w; i++){
			costp[i] = sc.nextInt();
			cost += costp[i];
		}
		Arrays.sort(costp);

		for(int i=0; i<h; i++){
			costq[i] = sc.nextInt();
			cost += costq[i];		
		}
		Arrays.sort(costq);

		int p = 0;
		for(int i=0; i<h; i++){
			while(p<w){
				if(costq[i]>costp[p]){
					cost += costp[p]*(h-i);
					p++;
				}else{
					cost += costq[i]*(w-p);
					break;
				}
			}
			if(p==w) break;
		}

		System.out.println(cost);
	}
}