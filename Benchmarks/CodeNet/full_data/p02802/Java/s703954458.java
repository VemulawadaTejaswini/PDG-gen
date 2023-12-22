import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int ac_count = 0;
    int wa_count = 0;
    int[] ac_list = new int[n];//正解の数
    int[] wa_list = new int[n];//不正解の数
    int p=0 ;
    String s ;



    for(int i=0; i<m; i++){
      p = sc.nextInt() -1;
      s = sc.next();

      if(ac_list[p]<1){//問題が正解になっていない
        if(s.equals("AC")){
          ac_list[p] += 1;
        }else if(s.equals("WA")){
          wa_list[p] += 1;
        }
      }
    }
    for (int i = 0; i < n; i++) {
    if (ac_list[i] < 1) {
        wa_list[i] = 0;
    }
    }

    int ac_sum = 0;
    int wa_sum = 0;

    for(int i=0; i<n; i++){
    ac_sum += ac_list[i];
    wa_sum += wa_list[i];
    }


    System.out.println(ac_sum + " " + wa_sum);
  }
}