import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    static int n = sc.nextInt();
    static int[] arr = new int[n];

    static int[][] x = new int[n][];
    static int[][] y = new int[n][];


    public static void main(String[] args){

        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            x[i] = new int[arr[i]];
            y[i] = new int[arr[i]];
            for (int j=0; j<arr[i]; j++){
                x[i][j] = sc.nextInt()-1;
                y[i][j] = sc.nextInt();
            }
        }

        int[] condition = new int[n];
        int cnt = 0;

        for (int bit=0; bit<(1<<n); bit++){
            int tmp = 0;
            for (int i=0; i<n; i++){
                if ((bit&(1<<i))>0){
                    condition[i] = 1;
//                    System.out.println("E");
                }else {
                    condition[i] = 0;
                }
            }

            if (check(condition)){
                for (int i=0; i<n; i++){
                    if (condition[i]==1) {
                        tmp++;
//                        System.out.println(tmp);
                    }
                }
            }

            cnt = Math.max(cnt, tmp);
        }
        System.out.println(cnt);

    }

    public static boolean check(int[] condition){
        for (int i=0; i<n; i++){
            if (condition[i]==1){
                for (int j=0; j<arr[i]; j++){
                    if (condition[x[i][j]]!=y[i][j]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

}