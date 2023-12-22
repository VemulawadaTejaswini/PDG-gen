import java.util.*;
 
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int D = sc.nextInt();
    int cnt = 0;
    for(int i=1;i<M+1;i++) { 
    for(int j=22; j<D; j++){
      int d1 = j/10;
      int d10 = j%10;
      if(d1*d10 == i){
        cnt++;
      }
    }
    }
    System.out.println(cnt);
  }
}