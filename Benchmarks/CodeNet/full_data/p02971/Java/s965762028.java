import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);	
		
		int N=sc.nextInt();

		int[] a=new int[N];
		int max=0;
		int sec=0;
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(a[i]>max){
				sec=max;
				max=a[i];
			}else if(a[i]>sec){
				sec=a[i];
			}
		}
				
		for(int i=0;i<a.length;i++){
			if(a[i]==max){
				System.out.println(sec);
			}else{
				System.out.println(max);
			}

		}	
	}

}	