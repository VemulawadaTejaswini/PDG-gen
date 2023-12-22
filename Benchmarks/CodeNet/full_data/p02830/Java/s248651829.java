import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      String S = sc.next();
      String T = sc.next();
      
      char[]S1 = S.toCharArray();
      char[]T1 = T.toCharArray();
      
      for(int i =0; i<N; i++){
       System.out.print(S1[i]+""+T1[i]);
      }
    }
}