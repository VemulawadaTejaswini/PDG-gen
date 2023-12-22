import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int[] count = new int[n - 1];
    int max = 0;
    for(int j = 1; j < n; j++){
      for(int k = 0; k < j; k++){
        Inner:
        for(int l = j; l < n; l++){
          if(s.charAt(k) == s.charAt(l)){
            count[j - 1]++;
            break Inner;
          }
        }
      }
    }
    for(int j = 0; j < n; j++){
      if(count[j] > max)
        max = count[j];
    }
    System.out.println(max);
  }
}