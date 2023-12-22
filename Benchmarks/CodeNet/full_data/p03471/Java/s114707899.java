import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc  = new Scanner(System.in);
      	int n = sc.nextInt();
      	int y = sc.nextInt();
      	int ans10000 = -1;
      	int ans5000 = -1;
      	int ans1000 = -1;
      
      	for(int i = 0; i <= n; i++){
        	for(int j = 0; i+j <= n; i++){
            	int k = n - i - j;
              	int total = (10000*i) + (5000*j) + (1000*k);
              	if(total == y){
                	ans10000 = i;
                  	ans5000 = j;
                  	ans1000 = k;
                }
            }
        }
      	System.out.println(ans10000 + " " + ans5000 + " " + ans1000);
    }
}