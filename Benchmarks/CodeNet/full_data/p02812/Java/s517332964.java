import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();

        int count = 0;
        boolean isA = false;
        boolean isB = false;
        for (int i = 0; i < N; i++){
            if (S[i] == 'A' && isB == false) {
                isA = true;
            }else if (S[i] == 'B' && isA == true) {
                isB = true;
            } else if (S[i] == 'C' && isB == true) {
                count++;
                isA = false;
                isB = false;
            } else {
                isA = false;
                isB = false;
            }
        }
        System.out.println(count);
    }
}
