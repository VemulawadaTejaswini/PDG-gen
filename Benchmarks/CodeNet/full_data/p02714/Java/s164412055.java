import java.util.Scanner;

public class Main {

    Main(){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

        long r=0,g=0,b=0;
        for(int i=0;i<N;i++){
            switch (S.charAt(i)){
                case 'R':
                    r++;
                    break;
                case 'G':
                    g++;
                    break;
                case 'B':
                    b++;
                    break;
            }
        }

        long total = r*g*b;

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                int k = j + j - i;

                if(N <= k) continue;

                if(S.charAt(i) != S.charAt(j)
                    && (S.charAt(j) != S.charAt(k)
                    &&  S.charAt(i) != S.charAt(k))){
                    total--;
                }
            }
        }

        System.out.println(total);
    }

    public static void main(String[] args) {
        new Main();
    }
}
