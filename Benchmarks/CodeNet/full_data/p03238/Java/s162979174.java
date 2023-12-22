import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
      	int t = sc.nextInt();
      
        int cost[] = new int[n];
      	int time[] = new int[n];
        for(int i = 0; i < n; i++){
        	cost[i] = sc.nextInt();
          	time[i] = sc.nextInt();
        }
      	int flag = 0;
      	//暫定最小
      	int min = cost[0];
        for(int j = 0; j < n; j++){
        	if(time[j]<=t){
              if(min>cost[j]){
              	min = cost[j];
              }
 				flag =1;
            }
        }
      if(flag ==0){
        System.out.println("TLE");
      }else{
      	System.out.println(min);
      }
    }
}