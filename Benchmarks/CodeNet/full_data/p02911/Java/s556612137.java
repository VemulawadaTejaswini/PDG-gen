import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
      	int[] Player;
      	int Current;
      	Player=new int[N];
      	for (int i = 0 ; i < N; i++){
          Player[i]=K;
        }     	
      	for (int i = 0 ; i < Q; i ++){
          Current = sc.nextInt();
          for (int j = 0 ; j < N ; j ++){
            if (j != (Current-1)){
           		Player[j]=Player[j]-1;
            }
          }
        }
      	for ( int i = 0 ; i < N ; i ++){
          if(Player[i]>0){
          	System.out.println("Yes");
          }else{
            System.out.println("No");
          }
        }
	}
}