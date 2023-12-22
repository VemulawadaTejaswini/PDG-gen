import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] l = line.split(" ");

        int N = Integer.parseInt(l[0]);
        int A = Integer.parseInt(l[1]);
        int B = Integer.parseInt(l[2]);

        int min = A * (N-1) + B;
        int max = A + B * (N-1);

        int ans = max - min + 1;


        if(ans < 0) {
          System.out.println(0);
        } else if(N == 1) {
          if(A != B) {
            System.out.println(0);
          } else {
            System.out.println(1);
          }
        } else {
          System.out.println(ans);
        }
    }
}