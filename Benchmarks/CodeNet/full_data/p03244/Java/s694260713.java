import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] a = new int[100001];
		int[] b = new int[100001];
		for(int i=0;i<n;i++){
			if(i%2==0)
				a[sc.nextInt()]++;
			else
				b[sc.nextInt()]++;
		}
		
		int max1=0, max2=0;
		int num1=0, num2=0;
		for(int i=1;i<a.length;i++){
			if(a[i]>max1){
				max1=a[i];
				num1=i;
			}
		}
		for(int i=1;i<b.length;i++){
			if(b[i]>max2){
				max2=b[i];
				num2=i;
			}
		}
		
		if(num1!=num2){
			System.out.println(n-max1-max2);
		}
		else{
			int ma1=0, ma2=0;
			int s=0, t=0;
			for(int i=0;i<a.length;i++){
				if(a[i]>ma1 && i!=num1){
					ma1=a[i];
					s=i;
				}
			}
			for(int i=0;i<b.length;i++){
				if(b[i]>ma2 && i!=num2){
					ma2=b[i];
					t=i;
				}
			}
			
			if(s==0 && t==0){
				System.out.println(n/2);
			}
			else if(s==0){
				System.out.println(n/2-ma2);
			}
			else if(t==0){
				System.out.println(n/2-ma1);
			}
			else{
				System.out.println(n-Math.max(max1+ma2, ma1+max2));
			}
		}
	}
}
/*
4
3 1 3 2
*/