import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int[n];
      	int b = 0;
      	int b2 = 0;
      	int sum = 0;
      	int sum2 = 0;
      	for(int i=0; i<n; i++){
        	a[i] = sc.nextInt() - (i+1);
        }
      	Arrays.sort(a);
      	if(n%2==0){
        	b = (a[n/2] + a[n/2-1])/2;
          	b2 = b + 1;
          	for(int i=0; i<n; i++){
            	sum += Math.abs(a[i]-b);
              	sum2 += Math.abs(a[i]-b2);
            }
          	sum = Math.min(sum, sum2);
        }
      	else{
        	b = a[(n+1)/2 - 1];
          	for(int i=0; i<n; i++){
            	sum += Math.abs(a[i]-b);
            }
        }
      	System.out.println(sum);
    }
}