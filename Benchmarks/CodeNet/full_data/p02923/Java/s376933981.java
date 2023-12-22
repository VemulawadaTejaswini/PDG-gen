import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 整数の入力
	int size = Integer.parseInt(sc.nextLine());
    int[] cell = new int[size];
    for(int i = 0; i < size; i++){
      cell[i] = Integer.parseInt(sc.next());
    }
    //System.out.println(cell[size-1]);
    
    //計算
    int maxmove = 0;
    int nowmove = 0;
    for(int i = 0; i < size-1; i++){
      if(cell[i] >= cell[i+1])
      {
        //進行可能
        nowmove++;
        //System.out.println("ikeru");
      }
      else
      {
        //進行不可
        if(maxmove < nowmove){
          maxmove = nowmove;
        }
        nowmove = 0;
        //System.out.println("muri");
      }
      
    }
    
    if(maxmove < nowmove){
          maxmove = nowmove;
    }
    
    System.out.println(maxmove);
    
  }
}