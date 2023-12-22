import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        int ans = 0;
        for(int i = 0; i < N; i++){
            if(A.charAt(i) != B.charAt(i) && A.charAt(i) != C.charAt(i) && B.charAt(i) != C.charAt(i)) ans += 2;
            else if(A.charAt(i) != B.charAt(i) && A.charAt(i) != C.charAt(i) && B.charAt(i) == C.charAt(i)) ans += 1;
            else if(A.charAt(i) != B.charAt(i) && A.charAt(i) == C.charAt(i) && B.charAt(i) != C.charAt(i)) ans += 1;
            else if(A.charAt(i) == B.charAt(i) && A.charAt(i) != C.charAt(i) && B.charAt(i) != C.charAt(i)) ans += 1;
        }

        System.out.println(ans);
        sc.close();
    }

}
