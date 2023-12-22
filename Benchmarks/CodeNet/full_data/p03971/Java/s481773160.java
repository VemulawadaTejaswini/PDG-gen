import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
        String S = sc.next();
        int countAB = 0, countB = 0;
        for (int i = 0;i < N;i++){
            if (S.charAt(i) == 'a' && countAB < A+B){
                System.out.println("Yes");
                countAB++;
            } else if (S.charAt(i) == 'b' && countAB < A+B && countB < B){
                System.out.println("Yes");
                countAB++;
                countB++;
            }else{
                System.out.println("No");
            }
        }

    }
}