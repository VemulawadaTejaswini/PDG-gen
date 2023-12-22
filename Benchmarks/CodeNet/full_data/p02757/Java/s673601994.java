import java.util.Scanner;
public class Main {
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int P = sc.nextInt();
    String S = sc.next();
    long ans = 0;
    if(P==2||P==5){
      for(int i = N-1; i >= 0; i--){
        if((S.charAt(i)-'0')%P==0){
          ans+=i+1;
        }
      }
    } else {
      int amari[] = new int[P];
      int jouyo = 0;
      int kurai = 1;
      for(int i = N-1; i >= 0; i--){
        jouyo = (jouyo + (S.charAt(i)-'0')*kurai)%P;
        kurai = (kurai*10)%P;
        amari[jouyo]++;
      }
      ans = amari[0];
      for(int i = 0; i < P; i++){
        ans += (long)amari[i]*(amari[i]-1)/2;
      }
    }
    System.out.println(ans);
    return;
  }
}