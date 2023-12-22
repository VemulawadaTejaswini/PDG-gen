import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int a, b, c;
        long[][] score = new long[N][N];
        long[] peekScore = new long[N];
        long answer = 0;
        
        for(int i = 0; i < N; i++) {
            if(i != 0) peekScore[i] = Long.MIN_VALUE;
            for(int j = 0; j < N; j++) {
                score[i][j] = -1;
            }
        }
        
        for(int i = 0; i < M; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            
            score[a-1][b-1] = c;
        }
        
        boolean isNotEnded = true;
        int updateNum = 0;
        
        while(isNotEnded) {
            isNotEnded = false;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(score[i][j] != -1) {
                        peekScore[j] = Math.max(peekScore[j], peekScore[i] + score[i][j]);
                        if(peekScore[j] < (peekScore[i] + score[i][j])) isNotEnded = true;
                    }
                }
            }

            updateNum++;
            if(updateNum == 10000) {
                System.out.println("inf");
                return;
            }
        }
        answer = peekScore[N-1];
        
        System.out.println(answer);

    }
}
