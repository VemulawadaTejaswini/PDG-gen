import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] timeA = new int[n];
        int[] pos = new int[n];
        
        for(int i=0; i<n; i++){
            timeA[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] timeB = new int[m];
        int[] sum = new int[m];
        
        for(int i=0; i<m; i++){
            pos[i] = sc.nextInt();
            timeB[i] = sc.nextInt();
        }
        
        for(int x=0; x<n; x++){
            for(int y=0; y<m; y++){
                if(pos[y] == x+1){
                    sum[y] += timeB[y];
                }else{
                    sum[y] += timeA[x];
                }
            }
        }
        
        for(int y=0; y<m; y++){
            System.out.println(sum[y]);
        }
	}
}
