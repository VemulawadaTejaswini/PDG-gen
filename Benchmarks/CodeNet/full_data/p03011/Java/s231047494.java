import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int P = sc.nextInt();
    int Q = sc.nextInt();
    int R = sc.nextInt();
    
    int A = P + Q;
    int B = R + Q;
    int C = P + R;
    int D = Q + R;
    int E = R + P;
    int F = Q + P;
    
    int values[] = {A, B, C, D, E, F};
        int min = values[0];
 
        for (int i = 1; i < values.length; i++) {
            min = Math.min(min, values[i]);
        }
        System.out.println(min);

  }
}