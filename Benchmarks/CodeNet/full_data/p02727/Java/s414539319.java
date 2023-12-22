import java.util.*;
public class Main{
	public static final Scanner in =  new Scanner(System.in);
	public static void main(String args []){
		int x = in.nextInt();
		int y = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int red [] = new int [a];
		int green [] = new int [b];
		int colo [] = new int [c];
		for(int i=0;i<a;i++){
			red[i] = in.nextInt();
		}
		for(int i=0;i<b;i++){
			green[i] = in.nextInt();
		}
		for(int i=0;i<c;i++){
			colo[i] = in.nextInt();
		}
		Arrays.sort(red);
		Arrays.sort(green);
		Arrays.sort(colo);
		int sum =0;
		int m=a-1;
		int n=c-1;
		
		while(x>0){
			if(n>=0){
				if(red[m]>colo[n]){
					sum+=red[m];
					m--;
				}else{
					sum+=colo[n];
					n--;
				}
			}else{
				sum+=red[m];
				m--;
			}
			x--;
		}
		int k=b-1;
		while(y>0){
			if(n>=0){
			if(green[k]>colo[n]){
				sum+=green[k];
				k--;
			}else{
				sum+=colo[n];
				n--;
			}
			}else{
				sum+=green[k];
				k--;
			}
			y--;
		}
		System.out.print(sum);
	}
}
