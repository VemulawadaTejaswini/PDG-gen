import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] road = new int[m*2];
		int[] ans = new int[n];
		
		for(int i=0; i<m*2; i++){
		    road[i] = sc.nextInt();
		    for(int j=0; j<n; j++){
		        if(road[i]==j+1){
		            ans[j]++;
		        }
		    }
		}
		
		for(int i=0; i<n; i++){
            System.out.println(ans[i]);
		}
	}
}
