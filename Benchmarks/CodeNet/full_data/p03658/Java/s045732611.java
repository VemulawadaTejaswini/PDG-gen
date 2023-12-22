import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //棒の全体数
    int K = sc.nextInt(); //取る棒の本数
    int[] rodList = new int[55];
    int rodSum = 0;
    for(i=0; i < N; i++){
      rodList[i] = sc.nextInt();  
    }
    //降順ソート
    for(int j = 0; j < 55; j++){
    for(int i = 54; i > j; i--){
      if(rodList[i - 1] < rodList[i]){
        int swap = rodList[i-1];
        rodList[i-1] = rodList[i];
        rodList[i] = swap;
      }
    }
    }
    for(int i = 0; i < K; i++){
      rodSum += rodList[i];
    }
   System.out.println(rodSum); 
  }
}