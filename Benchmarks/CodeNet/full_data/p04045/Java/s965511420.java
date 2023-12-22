import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String[] d = new String[k];
    for(int i = 0;i<k;i++){
      d[i] = sc.next();
    }
    int now = n;
    sousa: while(true){
      String nows = String.valueOf(now);
      for(int i = 0;i<k;i++){
        if(nows.contains(d[i])){
          now++;
          continue sousa;
        }
      }
      break;
    }
    System.out.println(now);
  }
}
