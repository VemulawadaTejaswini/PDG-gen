import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] n = new int[N];
    String error = "0";
    for(int i = 0; i < M; i++){
      int s = sc.nextInt();
      int c = sc.nextInt();
      if(s == 1 && c == 0){
        error = "-1";
        System.out.println(error);
        break;
      }
      else if(n[s - 1] == 0 || n[s - 1]  == c){
        n[s - 1] = c;
      } else {
        error = "-1";
        System.out.println(error);
        break;
      }
    }
    if(n[0] == 0){
      n[0] = 1;
    }
    if(error == "0"){
      for(int i = 0; i < N; i++){
        System.out.print(n[i]);
      }
    }
  }
}
