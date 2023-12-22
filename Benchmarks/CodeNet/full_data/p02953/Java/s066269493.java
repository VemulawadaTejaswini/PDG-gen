import java.util.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int h[]=new int[n];
		boolean ans=true;

		for(int i=0;i<n;i++){
			h[i]=sc.nextInt();
		}

		if(n==2 && h[0]>h[1]){
			if(h[0]-1!=h[1]){
				ans=false;
			}
		}

		for(int i=0;i<=n-3;i++){

			if(n>=3){
				if(h[i]>h[i+1] && h[i+1]>h[i+2]){
					ans=false;
				}
			}
		}

		if(ans==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}
