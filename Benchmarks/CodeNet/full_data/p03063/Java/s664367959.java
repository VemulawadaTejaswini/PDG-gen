import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String S = scanner.next();
        scanner.close();

        String[] str = S.split("");

        int count = 0;

        int blackCount = 0;
        int whiteCount = 0;

        int firstBlackIdx = 0;
        boolean firstBlack = false;

        int endIndex = 0;
        boolean whiteTurn = false;

        boolean ngPattern = false;

        for (int i = 0; i < N; i++) {
            if(!firstBlack){
                if ("#".equals(str[i])) {
                    firstBlack = true;
                    firstBlackIdx = i;
                }
                continue;
            }

            if(".".equals(str[i])){
                if(!whiteTurn){
                    whiteTurn = true;
                    ngPattern = true;
                }
            }else{
                if(whiteTurn){
                    whiteTurn = false;
                    endIndex = i-1;
                }
            }
        }

        if(whiteTurn){
           endIndex = N-1;
        }

        for (int i = firstBlackIdx; i <= endIndex; i++) {
            if ("#".equals(str[i])) {
                blackCount++;
            } else {
                whiteCount++;
            }
            if (i != 0 && ("#".equals(str[i - 1]) && ".".equals(str[i]))) {
                ngPattern = true;
            }
        }

        if (ngPattern) {
            count = Math.min(blackCount, whiteCount);
        }

        System.out.println(count);

//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
