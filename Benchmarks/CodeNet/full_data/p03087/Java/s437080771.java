import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int l,r;
    int[] ans = new int[q];
    for(int i = 0;i < q;i++){
      l = sc.nextInt();
      r = sc.nextInt();
      ans[i] = check_length(l,r,s);
    }
    for(int i = 0;i < q;i++){
      System.out.println(ans[i]);
    }
  }
  public static int check_length(int l,int r,String s){
    String S[] = s.split("");
    boolean flag = false;
    int count = 0;
    String A = "A";
    String C = "C";
    for(int i = l-1;i < r;i++){
      if(S[i].equals(A)){
        flag = true;
      }
      else if(S[i].equals(C) && flag){
        count++;
        flag = false;
      }
      else{
        flag = false;
      }
    }
    return count;
  }
}
