import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        String combo = "";

        for (int i = 0; i < N; i++) {
            combo += String.valueOf(S.charAt(i));
            combo += String.valueOf(T.charAt(i));
        }
        System.out.println(combo);
    }
}