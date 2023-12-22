import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        long[] Ln;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ln = new long[N];
            for (int i = 0; i < Ln.length; i++) {
                Ln[i] = sc.nextLong();
            }

        }
        long result2 =0;
        for (int i = 0; i < Ln.length; i++) {
            for (int j = i+1; j < Ln.length; j++) {
                for (int j2 = j+1; j2 < Ln.length; j2++) {
                    if(isTri(Ln[i], Ln[j], Ln[j2])){
                        result2++;
                    }
                }
            }
        }
        System.out.println(result2);

    }

    private static boolean isTri(long a,long b,long c){
        long[] arr = new long[]{a,b,c};
        Arrays.sort(arr);
        if(arr[0] + arr[1] > arr[2]){
            return true;
        }else{
            return false;
        }
    }


}
