import java.io.*;
import java.util.*;

class Main {
 	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int N = Integer.parseInt(br.readLine());
      	int[] arr = new int[N];
      	int[] dp = new int[N];
      	dp[0] = 1;
      	int ans = 0;
      	StringTokenizer st = new StringTokenizer(br.readLine());
      	arr[0] = Integer.parseInt(st.nextToken());
      	for(int i=1;i<N;i++) {
         	arr[i] = Integer.parseInt(st.nextToken());
          	int tmp = (arr[i-1] + 1) / 2;
          	if(tmp%2 != 0) {
             	tmp++; 
            }
          	if(tmp > dp[i-1])
              ans += d[i-1];
         	else {
              ans += tmp;
              arr[i] *= (-2*tmp);
            }
        }
      	System.out.println(ans);
    }
}