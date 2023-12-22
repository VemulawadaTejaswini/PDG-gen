import java.util.*;
 
public class Main{
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
      	int n = scan.nextInt();
      	int l = scan.nextInt();
      	int[] arr = new int[n];
      	int sum = 0;
      	int min = 0;
      	for(int i = 0; i<n; i++){
        	arr[i] = l + i ;
          	sum += arr[i];
        }
      if(l > 0){
      	Arrays.sort(arr);
        System.out.print(sum - arr[0]);
      }
      else if(l == 0){
      	System.out.print(sum - 0);
      }
      
      else{
      		for(int j = 0; j < n-1; j++){
              	if(Math.abs(sum - arr[j]) < Math.abs(sum - arr[j + 1])){
                  min = sum - arr[j];
                }
              	else {
                	min = sum - arr[j+1];
                }
      			
      		}
        System.out.print(min);
      }
      	
    }
}