import java.util.*;

public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] order = new int[num];
    
    for (int i = 1; i < num+1; i++){
      order[sc.nextInt()-1] = i;
    }
    for (int i = 0; i < num; i++){
      System.out.print(order[i] + " ");
    }
  }
}