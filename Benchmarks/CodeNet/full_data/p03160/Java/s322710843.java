import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	sc.nextLine();
      
      	int cost[] = new int[n];
      	for(int i = 0; i < n; i++)
          cost[i] = sc.nextInt();
      
      	int result[] = new int[n];
      	result[0] = 0;
      	result[1] = Math.abs(cost[0] - cost[1]);
      
      	int cost1 = 0;
      	int cost2 = 0;
      	for(int i = 2; i < result.length; i++){
          	cost1 = Math.abs(cost[i] - cost[i-1]) + result[i-1];
          	cost2 = Math.abs(cost[i] - cost[i-2]) + result[i-2];
      		if(cost1 > cost2)
              result[i] = cost2;
          	else
              result[i] = cost1;
        }  	
      	System.out.println(result[result.length-1]);
    }
}