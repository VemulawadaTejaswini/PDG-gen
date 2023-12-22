import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B == A) {
            System.out.println(B / A);
        } else {
            int answer = ((B / A) + 1) * A - B / A;
            if (answer >= B) {
                if(B % A == 0){
                    System.out.println(B / A);
                }else {
                    System.out.println((B / A) + 1);
                }
            } else {
                for (int i = (B / A); i < 300; i++) {
                    answer = (i + 1) * A - i;
                    if (answer >= B) {
                        System.out.println(i + 1);
                        break;
                    }
                }
            }
        }
    }
}
