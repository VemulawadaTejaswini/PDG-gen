import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int[] a = new int[n];
        boolean[] set = new boolean[n];
        int m = stdIn.nextInt();
        int s, c;
        int[] checkS = new int[m];
        int[] checkC = new int[m];
        boolean existFlag = true;
        for(int i=0; i<m; i++){
            s = stdIn.nextInt();
            c = stdIn.nextInt();
            checkS[i] = s;
            checkC[i] = c;

            if(set[s-1] && (a[s-1] != c)){
                System.out.println("-1");
                return;
            }

            set[s-1] = true;
            a[s-1] = c;

        }

        for(int i=0; i<n; i++){
            if(!set[i]){
                a[i] = 0;
            }
        }

        for(int i=0; i<m; i++){
            if(a[checkS[i]] != checkC[i]){
                System.out.println("-1");
            }
        }

        int i = 0;
        while(a[i] == 0 && i<n-1){
            i++;
        }
        for(; i<n; i++){
            System.out.print(a[i]);
        }
    }

    static boolean isAllZero(int[] a){
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                return false;
            }
        }
        return true;
    }
}