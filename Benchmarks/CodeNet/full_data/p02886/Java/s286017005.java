import java.util.*;

public class Main {
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	
	int n = in.nextInt();
	int a[] = new int[n];
	for(int i=0;i<n;i++){
	    a[i] = in.nextInt();
	}
	long ans = 0;
	for(int i=0;i<n-1;i++){
	    for(int j=i+1;j<n;j++){
		ans += a[i] + a[j];
	    }
	}
	System.out.println(ans);
    }
}
