import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        if ((A - 2 * B) > 0){
            System.out.println(A - 2 * B);
        }else{System.out.println(0);
          }

    }
}