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
      	before = now;
    }
    total *= howmany(N, before);
    total %= 1000000007;
    System.out.println(total);
  }
  
  private static int howmany(int now, int before){
    int diff = now - before -1;
    if(diff == 0){
      return 0;
    }else{
      return fi(diff);
    }
    
  }
  private static int fi(int n){
    if(n<3){
      return 1;
    }else{
      return fi(n-1) + fi(n-2);
    }
  }
}
