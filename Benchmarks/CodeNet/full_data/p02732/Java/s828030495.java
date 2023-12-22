import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n];
		int[] g=new int[n+1];
		for(int i=0;i<n;i++){
			a[i]= sc.nextInt();
          	g[a[i]]++;
		}
      	int all=0;
      	for(int i=0;i<n;i++){
          all+=g[i]*(g[i]-1)/2;
        }  
      	//System.out.println(all);

		for(int i=0;i<n;i++){
			System.out.println(all-g[a[i]]+1);
		}
		
	}
}
