import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();

        char atchar = S.charAt(K-1);

        char charExtract = 'A';
        for (int i=0; i<N; i++) {
            charExtract = S.charAt(i);
            if (atchar != charExtract) {
                S = S.replace(charExtract, '*');
            }
        }
        System.out.println(S);
    }
}