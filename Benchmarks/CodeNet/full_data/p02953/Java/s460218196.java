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

		int a=h[0];

		if(n==2 && h[0]>h[1]){
			if(h[0]-1!=h[1]){
				ans=false;
			}
		}

		ma:for(int i=1;i<n;i++){
			if(h[i]==a-1){
				a=h[i];
				for(int s=i+1;s<n;s++){
					if(h[s]==a-1){
						ans=false;
						break ma;
					}else if(h[s]>a){
						break;
					}else if(h[s]<a-1){
						ans=false;
						break ma;
					}
				}
			}
			if(h[i]<a-1){
				ans=false;
				break;
			}
			a=h[i];
		}

		if(ans==true){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}
