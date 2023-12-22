import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n;
    int h[] = {0,0,0};
    int w[] = {0,0,0};
    int c[] = {0,0};
    int stack;
    int stack2;
    int stack3;
    boolean nb = true;
    
    Map<Integer, Integer> board = new HashMap<Integer, Integer>();
	
    for(int i = 0; i < 3;i++){
    	for(int j = 0; j < 3;j++){
        	board.put(sc.nextInt(),i * 10 + j);
        }
    }
    
    n = sc.nextInt();
    
    for(int i = 0; i < n;i++){
    	stack = sc.nextInt();
      	if(board.containsKey(stack)){
          stack = board.get(stack);
          stack2 = stack/10;
          stack3 = stack%10;
          w[stack2]++;
          h[stack3]++;
          if(stack2 == stack3) c[0]++;
          if(3 - stack2 == stack3) c[1]++;
          if(w[stack2] == 3 || h[stack3] ==3 || c[0] == 3 || c[1] == 3) nb = false;
        }
    }
    
    if(nb) System.out.println("No");
    else System.out.println("Yes");

  }
}
