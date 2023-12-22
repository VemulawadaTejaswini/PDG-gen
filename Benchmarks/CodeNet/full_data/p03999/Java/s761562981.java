import java.util.*;
public class Main{
  static long ans = 0;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();
    calc(1,0,arr[0]-'0',arr);
    System.out.println(ans);
  }
  static void calc(int idx,long sum,long add,char[] arr){
    if(idx==arr.length){
      ans+=sum+add;
      return;
    }
    int x = arr[idx]-'0';
    calc(idx+1,sum+add,x,arr);
    calc(idx+1,sum,x+add*10,arr);
  }
}
