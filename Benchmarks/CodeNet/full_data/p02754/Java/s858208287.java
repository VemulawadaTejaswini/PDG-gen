import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int A = cin.nextInt();
        int B = cin.nextInt();
        char[] S = new char[N];

        int pos = 0;
        for(int i = 0; i < A; i++){
            S[pos] = 'A';
            pos++;
        }

        for(int i = 0; i < B; i++){
            S[pos] = 'B';
            pos++;
        }

        int cnt = 0;
        for(int i = 0; i < N; i++)
            if(S[i] == 'A')
                cnt++;

        System.out.println(cnt);
        cin.close();
    }
}