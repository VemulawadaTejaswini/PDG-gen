import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int[] e = new int[2];
    int[] w = new int[2];
    for(int i = 0; i < n; i++){
      e[1] += (s.charAt(i) == 'E') ? 1 : 0;
      w[1] += (s.charAt(i) == 'W') ? 1 : 0;
    }
    int min;
    if(s.charAt(0) == 'E'){
      e[1]--;
      min = e[1];
    }else{
      w[1]--;
      min = e[1];
    }
    for(int i = 1; i < n; i++){
      if(s.charAt(i-1) == 'W'){
        w[0]++;
      }else{
        e[0]++;
      }
      if(s.charAt(i) == 'W'){
        w[1]--;
      }else{
        e[1]--;
      }
      min = Math.min(min, e[1] + w[0]);
    }
    System.out.println(min);
  }
}