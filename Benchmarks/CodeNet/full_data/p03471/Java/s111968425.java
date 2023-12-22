//ABS提出結果からコピー
import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int ansA = -1;
    int ansB = -1;
    int ansC = -1;
    BREAK:for (int i=0;i<=N;i++){ 
      for (int j=0;j<=(N-i);j++){
        for (int k=0;k<=(N-i-j);k++){
          int sum = (10000*i)+(5000*j)+(1000*k);
          if ((sum == Y)&&(N == (i+j+k))){
            ansA = i;
            ansB = j;
            ansC = k;
            break BREAK;
          }
        }
      }
    }
    System.out.println(ansA + " " + ansB + " " + ansC);
  }
}