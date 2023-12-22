import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = sc.nextInt();
    int posi = 0;
    int nega = 0;
    for(int i = 0; i < m; i++) {
        if(sc.nextInt() > x) {
            posi++;
        } else {
            nega++;
        }
    }
    
    if(posi > nega) {
        System.out.println(nega);
    } else {
        System.out.println(posi);
    }
  }
}