import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[][] array = new int[q][2];
    int count;
    for(int i=0; i<q; i++){
      for(int j=0; j<2; j++){
        array[i][j] = sc.nextInt();
      }
    }
    
    for(int i=0; i<q; i++){
      count = 0;
      int x = array[i][0];
      int y = array[i][1];
      String[] words = s.substring(x-1, y-1).split("^(AC)");
      System.out.println(words.length);
    }
  }
}
