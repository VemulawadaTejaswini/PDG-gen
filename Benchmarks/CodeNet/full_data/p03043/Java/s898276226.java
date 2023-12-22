import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int K = scan.nextInt();
      	double ans = 0.0;
      	double[] anss = new double[n];
      	for(int i = 1; i <= n; i++){
        	if(i > K - 1){
              	anss[i-1] = 1.0 / n;
            }
          	else{
              	int j = i;
              	int counter = 0;
            	while(j < K){
                	j = j * 2;
                    counter ++;
                }
              anss[i-1] = (1.0/n) * Math.pow(0.5, counter); 
            }
        }
      	for(int k = 0; k < n; k++){
        	ans = ans + anss[k];
        }
      	System.out.print(ans);
    }
 
}