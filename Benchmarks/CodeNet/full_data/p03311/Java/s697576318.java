import java.util.*;

public class Main{
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		int tmp, b;
		int ans = 0;
		
		for(int i=0; i<num; i++){
			tmp = sc.nextInt();
			//a[i] = tmp;	
			a[i] = tmp-(i+1);	
		}

		Arrays.sort(a);
		if(num%2 == 0)
			b = a[num/2 - 1];
		else
			b = a[(num+1)/2 - 1];

		for(int i=0; i<num; i++){
			ans += Math.abs(a[i] - b);
		}
		
		//System.out.println(b);
		System.out.println(ans);
		
	}

}