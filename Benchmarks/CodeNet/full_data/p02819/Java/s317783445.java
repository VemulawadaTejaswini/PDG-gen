import java.util.Scanner;

public class Main{
  public static void main(String ars[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int ans = 0;
    for(int i = a;;i++){
      for(int j = 2;j <= i;j++){
        if(i % j == 0 && j != i) break;
        if(j == i) ans = i;  
      }
      if(ans != 0) break;
    }
    System.out.println(ans);
  }
}