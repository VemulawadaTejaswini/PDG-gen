import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] X = new int[N];
    int minScore = -1;
    for(int i=0; i<N; i++)
      X[i] = sc.nextInt();
    
    for(int i=1; i<=100; i++){
      int score = 0;
    	for(int j=0; j<=100; j++){
          	score += (X[i] - i)*(X[i] - i);
        }
     	if(minScore < 0 || minScore > score)
          minScore = score;
    }
    System.out.println(minScore);    
  }
}

