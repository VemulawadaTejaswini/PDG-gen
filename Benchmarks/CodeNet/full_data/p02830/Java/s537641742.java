import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        String ans = "";
        for (int i=0; i<n; i++){
            ans = ans + S.charAt(i)+T.charAt(i);
        }
        System.out.println(ans);
    }
}
