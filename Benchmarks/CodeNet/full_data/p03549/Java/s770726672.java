import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      sc.close();
      int ans = 0;
      ans = (n - m)*100 + 1900*m;
      ans *= kakuritsu(m);
      System.out.println(ans);
    }  
    static int kakuritsu(int m){
        int n = 1;
        for(int i = 1;i <= m;i++){
            n *= 2;
        }
        return n;
    }
}