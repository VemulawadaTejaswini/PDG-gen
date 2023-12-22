import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] S = s.toCharArray();
    int tmp;
    boolean flag = (S[0] == 'B');
    tmp = 100;
    if(flag){
      tmp = 0;
    }
    int count = 0;
    for(int i = 1; i< S.length; i++){
      if(flag){
        if(S[i] == 'W'){
          S[tmp] = 'W';
          S[i] = 'B';
          count += i - tmp;
          tmp = tmp + 1;
        }
      }else{
        if(S[i] == 'B'){
          tmp = i;
        }
      }
      flag = (S[i] == 'B');
    }
    System.out.println(count);
  }
}