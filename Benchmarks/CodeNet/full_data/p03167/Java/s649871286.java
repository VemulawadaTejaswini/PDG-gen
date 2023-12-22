import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    long[][] table = new long[H][W];
    for(int i = 0; i < table.length; i++){
      Arrays.fill(table[i], -1L);
      String str = sc.next();
      for(int j = 0; j < table[i].length; j++){
        table[i][j] = (str.charAt(j) == '#') ? 0L : table[i][j];
      }
    }
    System.out.println(solve(table));
  }
  
  public static long solve(long[][] table){
    boolean flag = false;
    for(int i = 1; i < table[0].length; i++){
      if(flag || table[0][i] == 0L){
        table[0][i] = 0;
        flag =true;
      }else{
        table[0][i] = 1L;
      }
    }
    flag = false;
    for(int i = 1; i < table.length; i++){
      if(flag || table[i][0] == 0L){
        table[i][0] = 0L;
        flag =true;
      }else{
        table[i][0] = 1L;
      }
    }
    for(int i = 1; i < table.length; i++){
      for(int j = 1; j < table[i].length; j++){
        if(table[i][j] == -1L){
          table[i][j] = (table[i][j-1] + table[i-1][j]) % (1000000000 + 7);
        }
      }
    }
    return table[table.length-1][table[0].length-1];
  }
}