import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 2^n-1;
    int num = 1;
    for(int i = 1; i <= a; i++){
            num = num * (n - i + 1) / i;
        }
        int f = return;
    int nume = 1;
    for(int i = 1; i <= b; i++){
            nume = nume * (n - i + 1) / i;
        }
        int g = return;
    int d = c - f - g;
    int e = d/(10^9+7);
    System.out.println( e );
  }
}
    