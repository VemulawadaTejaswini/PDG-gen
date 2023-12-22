import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int m = stdIn.nextInt();
        int L[] = new int [m];
        int R[] = new int [m];
        int maxL = 1; int minR = n;
        for(int i = 0; i < m; i++){
            L[i] = stdIn.nextInt();
            R[i] = stdIn.nextInt();
            if(maxL < L[i]) maxL = L[i];
            if(minR > R[i]) minR = R[i];
        }

        System.out.println(minR-maxL+1 >= 0 ? minR-maxL+1 : 0 );
    }
}