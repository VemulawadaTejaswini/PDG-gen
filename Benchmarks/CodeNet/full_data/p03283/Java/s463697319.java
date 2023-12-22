import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m_ = sc.nextInt();
    int q_ = sc.nextInt();
    int[][] m = new int[m_][2];
    int[][] q = new int[q_][2];
    for(int j = 0; j < m_; j++){
      for(int i = 0; i < 2; i++){
        m[j][i] = sc.nextInt();
      }
    }
    for(int j = 0; j < q_; j++){
      for(int i = 0; i < 2; i++){
        q[j][i] = sc.nextInt();
      }
    }
    
    for(int j = 0; j < q_; j++){
      int count = 0;
      for(int i = 0; i < m_; i++){
        if(q[j][0] <= m[i][0] && q[j][1] >= m[i][1])
          count++;
      }
      System.out.println(count);
    }
  }
}