import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();

        long R = 0, G = 0, B = 0;
        for (int i = 0;i < N;i++) {
            if (S.charAt(i) == 'R') R++;
            else if (S.charAt(i) == 'G') G++;
            else B++;
        }

        long ans = R * G * B;
        for(int i = 0;i < N;i++) {
            int j = i-1, k = i+1;
            while (j >= 0 && k < N) {
                if(S.charAt(i) != S.charAt(j)
                        && S.charAt(j) != S.charAt(k)
                        && S.charAt(i) != S.charAt(k))
                    ans--;
                j--;k++;
            }
        }
        System.out.println(ans);
    }
}
