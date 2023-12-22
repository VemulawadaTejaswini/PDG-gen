import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[10];
		Arrays.fill(arr,-1);
		for(int i=0;i<k;i++) {
			int q=sc.nextInt();
			arr[q]=q;
		}
		int b=0;
		for(int i=n;i<10000;i++) {
			b=i;
			while(b!=0) {
				if(arr[b%10]!=-1) break;
				b=b/10;
			}
			if(b==0) {
				System.out.println(i);
				return;
			}
		}
		
		

	}

}
