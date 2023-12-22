import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int[] a = new int[n];
      	int[] b = new int[n];
      	for(int i = 0; i < n;i++){
        	a[i] = scan.nextInt();
          	b[i] = scan.nextInt();
        }
      	int cost = n;
      	if(n== 1){
        	System.out.print(cost);
        }
      	else{
      	for(int j = 0; j < n; j++){
        	for(int k = 0; k< n-1;k++){
            	if(a[k+1]-a[k]==a[j] && b[k+1]-b[k] == b[j]){
                	cost--;
                }
              	int sabunx = a[j+1] - a[j];
              	int sabuny = b[j+1] -b[j];
              	if(sabunx == a[i+1] - a[i] && sabuny == b[i+1]- b[i]){
                	cost--;
                }
            }
        }
      	System.out.print(cost);
        }
    }
}	