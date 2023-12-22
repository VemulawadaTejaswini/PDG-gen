import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	sc.nextLine();
      
      
      	int cost[] = new int[n];
      	for(int i = 0; i < n; i++)
          cost[i] = sc.nextInt();
      
      
      	int result[] = new int[n];
      	result[0] = 0;

      	for(int i = 1; i < result.length; i++){
          	for(int j = 1; j <= k && (i-j) >= 0; j++){
              	if(j > 1) 
                  minSet(result, i, Math.abs(cost[i] - cost[i-j]) + result[i-j]);   
              	else
                  result[i] = Math.abs(cost[i] - cost[i-j]) + result[i-j];
            }
        }
      
     	System.out.println(result[result.length-1]);
    }
      
   	static void minSet(int[] result, int index, int cost){
      if(result[index] > cost)
        result[index] = cost;
    }
}