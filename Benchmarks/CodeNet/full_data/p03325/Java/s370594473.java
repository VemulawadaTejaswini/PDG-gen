import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	    int n;
		n = sc.nextInt();
		int ans=0;
		for(int i=0; i<n; i++){
			int a;
			a = sc.nextInt();
			while(a%2==0){
				ans++;
				a/=2;
			}
		}
	System.out.println(ans);
    }
}
