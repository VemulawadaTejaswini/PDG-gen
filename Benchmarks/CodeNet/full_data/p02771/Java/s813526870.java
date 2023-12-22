import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    String s= "APPROVED";
    int cnt = 0;
    for(int i= 0; i < n; i++){
      a[i] = sc.nextInt();
      if(a[i] % 2==0 ) {
        cnt++;
        if(a[i] % 3!= 0 || a[i] % 5 != 0) {
          s = "DENIED";
        }
      }
    }
    if(cnt ==0) s = "DENIED";
    System.out.println(s);
  }
}
