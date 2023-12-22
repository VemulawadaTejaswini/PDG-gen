import java.io.*;
import java.util.*;

public class Main{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int tmp;
		int ans1 = 0;
		int ans2 = 0;
		
		for(int i=0; i<num; i++){
			tmp = sc.nextInt();
			//a[i] = tmp;	
			a[i] = tmp-(i+1);	
		}

		Arrays.sort(a);
	
		for(int i=0; i<num; i++){
			ans1 += Math.abs(a[i] - a[num/2]);
			ans2 += Math.abs(a[i] - a[num/2+1]);
		}
		
		//out.println(b);
		System.out.println(Math.min(ans1,ans2));
		
	}

}