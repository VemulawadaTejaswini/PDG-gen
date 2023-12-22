import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = n;
		int y = n;
		
		for(int i=1; i<n; i++){
		    if(n%i==0){
		        if(i+(n/i)<x+y){
		            x = i;
		            y = n/x;
		        }
		    }
		}

		int ans = (x-1) + (y-1);

        System.out.println(ans);
	}
}
