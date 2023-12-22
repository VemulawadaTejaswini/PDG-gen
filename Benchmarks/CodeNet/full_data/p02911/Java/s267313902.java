import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); //参加者N人
    int K = sc.nextInt(); //初期ポイントK点
    int Q = sc.nextInt(); //Q回のポイント変動
    int num[] = new int[N];
    for(int j=0;j<N;j++){
      num[j] = 0;
    }
    int correct[] = new int[Q];
    
    for(int i=0;i<Q;i++){
      correct[i] = sc.nextInt();
      for(int k=0;k<N;k++){
        if(correct[i]==k+1){
          num[k]++;
        }
      }
    }
    
    int count = 0;
    for(int p=0;p<N;p++){
      if(num[p]>=Q-K+1){
        System.out.println("Yes");
      }else{
        System.out.println("N0");
      }
    }
  }
}