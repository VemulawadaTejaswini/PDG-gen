import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long H = sc.nextInt();
    long W = sc.nextInt();
    int ans = 0;
    for(int i=0; i<N; i++){
      long tmpH = sc.nextLong();
      long tmpW = sc.nextLong();
      if(H-tmpH >= 0 && W-tmpW >= 0){
        ans++;
      }
    }
    System.out.print(ans);
  }
}
        
