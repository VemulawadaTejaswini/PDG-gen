import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = Integer.parseInt(scanner.next());
    int M = Integer.parseInt(scanner.next());
    
    ArrayList<Integer> answer = new ArrayList<Integer>();
    for(int i=0;i<=M;i++){
      answer.add(0);
    }
    
    for(int i=0;i<N;i++){
      int A = Integer.parseInt(scanner.next());
      for(int j=0;j<A;j++){
      	int input = Integer.parseInt(scanner.next());
      	int pre = answer.get(input);
       	answer.set(input, pre + 1);
      }
    }
    int ans = 0;
    for(int i=1;i<=M;i++){
      if(answer.get(i) == N)
        ans++;
    }
    System.out.println(ans);
  }
}
