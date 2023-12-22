import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    for(int i = 1 ; i <= b ; ++i){
      int aa = a*i;
      if(aa%b == c){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}