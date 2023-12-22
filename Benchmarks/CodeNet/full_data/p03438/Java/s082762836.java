import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for (int i = 0; i < a.length; i++) 
			a[i]=s.nextInt();
		for (int i = 0; i < b.length; i++) 
			b[i]=s.nextInt();
		
		int[] dif=new int[n];
		
		for (int i = 0; i < dif.length; i++) {
			dif[i]=a[i]-b[i];
		}		
		int plus=0;
		int minus=0;
		
		for (int i = 0; i < dif.length; i++) {
			if(dif[i]<0)
				minus+=dif[i];
			else
				plus+=dif[i];		
		}
		
		while(true){
			if(plus==0 && minus<0){
				System.out.println("Yes");
				System.exit(0);
			}
			else if(plus==0&&minus>0){
				System.out.println("No");
				System.exit(0);
			}
			else if(plus>0&&minus>0){
				System.out.println("No");
				System.exit(0);
			}
			else{
				minus+=2;
				plus--;
			}
		}	
	}
}
