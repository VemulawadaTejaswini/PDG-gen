import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int now = 0;
    int before = 0;
    int total = 1;
    for(int i=1; i < M+1; i++){
    	now = sc.nextInt();
      	total *= howmany(now, before);
      	total %= 1000000007;
      	before = now;
    }
    total *= howmany(N, before);
    total %= 1000000007;
    System.out.println(total);
    
  }
  
  private static int howmany(int now, int before){
    int diff = now - before;
    if(diff == 1){
      return 0;
    }else{
      return fi(diff-1);
    }
    
  }
  private static int fi(int n){
    return n < 3 ? 1 : fi(n - 1) + fi(n - 2);
  }
}
