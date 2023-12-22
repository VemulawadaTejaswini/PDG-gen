import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int card[][] = new int[N+2][M+2];
        int cnt = 0;
        for(int i=0;i<N+2;i++){
          for(int j=0;j<M+2;j++){
            card[i][j] = 0;
          }
        }
        for(int i=1;i<=N;i++){
          for(int j=1;j<=M;j++){
            for(int k=-1;k<=1;k++){
              for(int l=-1;l<=1;l++){
                card[i+k][j+l]++;
//                System.out.println((i+k) + " " + (j+l)); 
              }
            }
          }
        }
        for(int i=1;i<=N;i++){
          for(int j=1;j<=M;j++){            
//            System.out.println(card[i][j]);  
            card[i][j] %= 2;
            if(card[i][j] == 1)
              cnt++;
          }
        }
        
        System.out.println(cnt);  
	}
}