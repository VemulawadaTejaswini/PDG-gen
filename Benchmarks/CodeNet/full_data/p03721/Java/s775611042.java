import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long k = scanner.nextLong();
		int a[] =new int[100000];
		int b[] =new int[100000];
		boolean judge=true;
		int ans=0;
		
		long bSum=0;
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
			b[i]=scanner.nextInt();
			if(i!=0&&a[i]<a[i-1]){
				int tmp=0;
				tmp=a[i-1];
				a[i-1]=a[i];
				a[i]=tmp;
				tmp=b[i-1];
				b[i-1]=b[i];
				b[i]=tmp;
			}
			
		}
		
		for(int i=0;i<n;i++){
			bSum+=b[i];
			if(bSum>=k&&judge){
				judge=false;
				ans=a[i];
			}
		}

		System.out.println(ans);
	}
}