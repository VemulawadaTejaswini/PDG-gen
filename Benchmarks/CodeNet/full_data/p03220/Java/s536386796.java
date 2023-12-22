import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    
    int x = (T - A) / 0.006;
    int diff = -1;
    int no = -1;
    
    for(int i=0;i<N-1;i++)
    {
      int H = sc.nextint();
      
      if (diff == -1 || diff > abs(H-x) ){
        diff = abs(H-x);
        no = i + 1;
      }
    }
    System.out.println(no);
  }
}