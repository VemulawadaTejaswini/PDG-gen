import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int all=0;
		int[] a =new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			all=all+a[i];
		}
		//int min=all/(m*4);
		//System.out.println(min);
		//Arrays.sort(a);
		int check=0;
		for(int i=0;i<n;i++){
			if(a[i]>=all/(m*4)){
				check++;
				
			}
		}
		if(check<m){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}

		
	}
	
}
