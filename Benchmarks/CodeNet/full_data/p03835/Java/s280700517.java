import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
        int S = sc.nextInt();
        int count = 0;
        
        loop: for(int i=0; i<=K; i++){
          for(int j=0; j<=K; j++){
            for(int k=0; k<=K; k++){
              int sum = i + j + k;
              if(sum > S){
                break loop;
              }
              if(sum == S){
                count++;
              }
            }
          }
        }
        System.out.println(count);
    }
}