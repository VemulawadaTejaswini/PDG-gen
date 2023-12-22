import java.util.*;

public final class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int[][] length = new int[N][N];

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                length[i][j] = s.nextInt();

            }
        }

        long re = 0;
        for (int i = 1; i < N; i++) {



            for (int j = 0; j < i; j++) {

                int distTocheck = length[j][i];

                boolean newFlag = true;

                for (int k = j + 1; k < i; k++) {

                    int sum = length[j][k] + length[k][i];

                    if (sum < distTocheck) {

                        System.out.print(-1);

                        return;
                        
                    } else if (sum == distTocheck) {

                        newFlag= false;
                    }
                }

               if(newFlag) re += distTocheck;

            }

        }

        System.out.print(re);
    }


}