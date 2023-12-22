import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[A];
		int[] b = new int[B];
		int i,minA,minB,sum,x,y,c;
		for(i = 0;i < A;i++){
			a[i] = sc.nextInt();
		}
		for(i = 0;i < B;i++){
			b[i] = sc.nextInt();
		}
		minA = min(a,A);
		minB = min(b,B);
		sum = minA + minB;
		for(i = 0;i < M;i++){
			x = sc.nextInt();
			y = sc.nextInt();
			c = sc.nextInt();
			if((a[x-1] + b[y-1] - c) < sum){
				sum = (a[x-1] + b[y-1] - c);
			}
		}
		System.out.println(sum);
	}
	public static int min(int[] list,int mini){
		int i;
		int buf = 100000;
		for(i = 0;i < mini;i++){
			if(buf > list[i]){
				buf = list[i];
			}
		}
		return buf;
	}
}