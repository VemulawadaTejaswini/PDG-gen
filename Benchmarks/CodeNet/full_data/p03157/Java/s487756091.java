import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    boolean[][] table = new boolean[H][W];
    int[][] table2 = new int[H][W];
    for(int i = 0; i < table.length; i++){
      String str = sc.next();
      Arrays.fill(table2[i], -1);
      for(int j = 0; j < str.length(); j++){
        table[i][j] = (str.charAt(j) == '#') ? true : false;
      }
    }
    System.out.println(solve(table, table2));
  }
  
  public static long solve(boolean[][] table, int[][] table2){
    int count = 0;
    for(int i = 0; i < table.length; i++){
      for(int j = 0; j < table[i].length; j++){
        if(table2[i][j] == -1){
          saiki(table, table2, i, j, count);
          count++;
        }
      }
    }
    int[][] counts = new int[count+1][2];
    
    for(int i = 0; i < table.length; i++){
      for(int j = 0; j < table[i].length; j++){
        if(table[i][j] == true){
          counts[table2[i][j]][0]++;
        }else{
          counts[table2[i][j]][1]++;
        }
      }
    }
    long ans = 0;
    for(int i = 0; i < counts.length; i++){
      ans += counts[i][0] * counts[i][1];
    }
    return ans;
  }
  
  public static void saiki(boolean[][] table, int[][] table2, int i, int j, int n){
    table2[i][j] = n;
    if(i-1 != -1){
      if(table[i][j] != table[i-1][j] && table2[i][j] != table2[i-1][j]){
        saiki(table, table2, i-1, j, n);
      }
    }
    if(j-1 != -1){
      if(table[i][j] != table[i][j-1] && table2[i][j] != table2[i][j-1]){
        saiki(table, table2, i, j-1, n);
      }
    }
    if(i+1 < table.length){
      if(table[i][j] != table[i+1][j] && table2[i][j] != table2[i+1][j]){
        saiki(table, table2, i+1, j, n);
      }
    }
    if(j+1 < table[0].length){
      if(table[i][j] != table[i][j+1] && table2[i][j] != table2[i][j+1]){
        saiki(table, table2, i, j+1, n);
      }
    }
  }
}