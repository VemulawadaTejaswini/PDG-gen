import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
class C134Test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nSeq = new int[n];

	for(int i = 0;i < n;i++){
      nSeq[i] = sc.nextInt();
    }
    int box = 0;
    for(int i = 0;i < n;i++){
      box = nSeq[i];
      nSeq[i] = 0;
      int max = 0;
      for(int x : nSeq){
          if(max < x){
              max = x;
          }
      }
    System.out.println(max);

      nSeq[i] = box;
    }
  }
}