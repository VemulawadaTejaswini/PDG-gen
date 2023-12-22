
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int v[] = new int[N];
        for(int i = 0; i < N; i++){
            v[i] = sc.nextInt();
        }
        double vMax = 0;
        Arrays.sort(v);
        vMax += (double)v[0] / Math.pow(2, N-1);
        for(int i = 1; i < N; i++){
            vMax += (double)v[i] / Math.pow(2, N-i);
        }


        System.out.println(vMax);




    }
}



