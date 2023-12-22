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

		for(int i=1;i<n-1;i++){
			if(h[0]>h[1]){
				if(h[0]-1!=h[1]){
					ans=false;
					break;
				}else{
					h[0]=h[0]-1;
				}
			}
			if(h[i]>h[i+1]){
				if(h[i]-1!=h[i+1] || h[i-1]==h[i]){
					ans=false;
					break;
				}else{
					h[i]=h[i]-1;
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
