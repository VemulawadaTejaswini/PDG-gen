import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int D = Integer.parseInt(sc.next());
    int G = Integer.parseInt(sc.next());
    int[] p = new int[D];
    int[] c = new int[D];

    for (int i=0; i < D; i++) {
      p[i] = Integer.parseInt(sc.next());
      c[i] = Integer.parseInt(sc.next());
    }
    int min = 100;
    for(int i=0; i<Math.pow(2,D); i++){
      int sum = 0; // 点数の合計
      int num = 0;//  解いた問題の合計
      int Most = -1; 
      for(int j=0; j<D; j++){
        // System.out.println(i + ":i, " +j + ":j");
        if((i>>j&1)==1){
          num = num + p[j];
          sum = sum + p[j]*(j+1)*100 + c[j];
          // System.out.println(num + ":num, " + sum + ":sum ");
        }else if((i>>j&1)==0){
          Most = j + 1;
        }
      int tmp = 0;
      if(sum>=G){
        tmp = num;
      }else if (Most == -1){
        break;
      }else{
        tmp = (G - sum)/(Most*100) + num; 
      }
      if(tmp < min){
        min = tmp;
      }
      // System.out.println(min + " :ans");
    }
  }
  System.out.println(min);
  return;
}
}

