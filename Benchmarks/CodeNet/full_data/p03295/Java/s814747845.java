import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] closestEnemy = new int[N+1];
        for(int n=0;n<=N;n++) closestEnemy[n] = N+1;
        for(int m=0;m<M;m++){
        	int a = sc.nextInt()-1;
        	int b = sc.nextInt()-1;
        	if(closestEnemy[a] > b)  closestEnemy[a] = b;
        }
        int ans = 0;
        for(int n=0;n<N;n++){
        	if(closestEnemy[n]==n+1) ans++;
        	else closestEnemy[n+1] = Math.min(closestEnemy[n+1],closestEnemy[n]);
        }
        System.out.println(ans);
    }
}