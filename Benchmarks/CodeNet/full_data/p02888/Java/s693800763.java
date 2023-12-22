import java.util.*;
    
public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
     
 	int n = Integer.parseInt(sc.next());
 	int[] l = new int[n];
	int cnt = 0;
	for(int i=0; i<n; i++){
	    l[i] = Integer.parseInt(sc.next());
	}
	
	for(int i=0; i<n; i++){
	    for(int j=i; j<n; j++){
	        if(i==j){
	            continue;
	        }
	        for(int k=j; k<n; k++){
	            if(j==k){
	                continue;
	            }
	            if(l[i]+l[j] > l[k] && l[j]+l[k] > l[i] && l[k]+l[i] > l[j]){
	                cnt++;
	            }
	        }
	    }
	}
	
	System.out.println(cnt);
		sc.close();
    }
}