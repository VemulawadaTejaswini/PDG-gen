import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        int n = S.length();

        for (int i = 0; i < n/ 2; i++) {
            if (S.charAt(i) != S.charAt(n - i - 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}