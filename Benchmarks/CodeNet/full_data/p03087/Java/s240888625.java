import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    int[] l = new int[q];
    int[] r = new int[q];
    int[] ans = new int[q];
    String S[] = s.split("");
    boolean flag = false;
    int count = 0;
    String A = "A";
    String C = "C";
    for(int i = 0;i < q;i++){
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }
    int j = 0;
    int i = l[j];
    while(1){
      if(j == q){
        break;
      }
      else if(i == r[j]){
        System.out.println(ans);
        j++;
        i = l[j];
      }
      else if(S[i].equals(A)){
        flag = true;
        i++;
      }
      else if(S[i].equals(C) && flag){
        count++;
        flag = false;
        i++;
      }
      else{
        flag = false;
      }
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
