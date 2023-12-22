import java.util.*;
public class Main {
  
  public static int p[];
  public static int min = 2*10*10*10*10*10 + 1;
  
  private static boolean judge(int i){
    
    //新たに見る配列がこれまでで最小か。
    if(min > p[i-1]){
      min = p[i-1];
      return true;
    }
    else{
      return false;
    }
    
    /*
    for(int j = 1; j <= i; j++){
      if(p[i-1] > p[j-1]){
        return false;
      }
    }
    return true;
    */
    //System.out.println();
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    p = new int[n];
    for(int i = 0; i < n; i++){
      p[i] = sc.nextInt();
    }
    
    int count = 0;
    
    for(int i = 1; i <= n; i++){
      if(judge(i)){
        count++;
      }
    }
    System.out.println(count);
  }
}