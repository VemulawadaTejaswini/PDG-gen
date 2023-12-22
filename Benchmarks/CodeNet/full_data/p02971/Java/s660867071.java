import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		
		int N=sc.nextInt();

		int[] a=new int[N];
		
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}

		for(int i=0;i<a.length;i++){
			int b=0;
			for(int j=0;j<a.length;j++){
				if(a[j]>b&&j!=i){
					b=a[j];
				}
				
			}
			System.out.println(b);
		}	
	}

}	
