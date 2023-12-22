import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        String[] str = S.split("");
        String a = "";
        String b = "";
        for(int i = 0; i < N/2; i++){
            a += str[i];
        }
        for(int i = N/2; i < N; i++){
            b += str[i];
        }

        if(a.equals(b)) System.out.println("Yes");
        else System.out.println("No");
    }
}