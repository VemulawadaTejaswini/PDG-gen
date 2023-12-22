import java.util.Scanner;
 
/**
 * Created by apple on 10/21/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int N = s1.nextInt();
        int A = s2.nextInt();
        int B = s3.nextInt();
        String S = s4.nextLine();
 
        int count = 0;
        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == 'a' && count < A + B) {
                count++;
                System.out.println("Yes");
            } else if(S.charAt(i) == 'b' && count < A + B && count <= B) {
                count++;
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}