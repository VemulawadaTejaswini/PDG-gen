import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int N = input.nextInt();
//        int A = input.nextInt();
        String S = input.next();
        String A = new StringBuffer().append(S).reverse().toString();
        int count = 0;

        for (int i = 0; i < S.length(); i++){
            if (S.charAt(i) == A.charAt(i)){
                count++;
            }
        }



        System.out.println(count);

//        for (int i = 0; i < N; i++){
//            for (int j = 0; j < A; j++){
//
//            }
//        }
    }
}