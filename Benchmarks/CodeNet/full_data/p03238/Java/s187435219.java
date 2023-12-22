import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        float N = sc.nextInt();
        float A = sc.nextInt();
        float B = sc.nextInt();
    
        String ans = "Hello World";
        
        if( N == 0){
        	System.out.print(ans);
        } else {
        	System.out.print(N+A+B);
        }
    }
  }