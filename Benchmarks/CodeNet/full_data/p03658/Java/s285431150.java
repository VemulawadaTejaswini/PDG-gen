import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] l = new int[n];
		int total=0;
		for(int i = 0;i < n;i++) {
			l[i] = sc.nextInt();
		}
		for(int i=0; i<n-1; i++){
		      for(int j=0; j<(n-1)-i; j++){
		    	  		if(l[j]<l[j+1]){
		    	  			int temp=l[j];
		    	  			l[j]=l[j+1];
		    	  			l[j+1]=temp;
		    	  		}
		      }
		}
		for(int i = 0;i < k;i++) {
			total = total+l[i];
		}
		System.out.println(total);
	}

}