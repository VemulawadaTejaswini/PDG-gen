import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int p[] = new int[N];
    int check = 0;

    for (int i = 0; i < N; i++){
      p[i] = scan.nextInt();
      if(p[i] != i+1){
        check++;
      }
    }
    
    if(check == 0 || check == 2){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}