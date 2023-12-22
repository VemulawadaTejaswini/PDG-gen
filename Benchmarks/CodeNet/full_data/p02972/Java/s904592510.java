import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] a=new int[N];
		
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		int counter=0;
		
		for(int i=0;i<N;i++) {
			if(a[i]==1) {
				count+=1;
			}
		}
		
		for(int i=0;i<N;i++) {
			if(a[i]==0||a[i]==1) {
				counter++;
			}
		}
		
		if(count!=0) {
			
			System.out.println(count);
		
			for(int i=0;i<N;i++) {
				if(a[i]!=0&&a[i]!=1) {
						
				}else if(a[i]==1) {
						System.out.print(i+1+"\t");
				}else {
					
				}
			}
					
		}else if(counter==0){
			System.out.print(-1);
		}else {
			System.out.println(0);
		}
		
		sc.close();
	}
}