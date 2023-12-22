
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int d[] = new int[N];
        int recover = 0;

        for(int i = 0; i  < N; i++){
          d[i] = sc.nextInt();
        }

        for(int i = 0; i < N-1 ; i++){
          int a = d[i];
          for(int j = i+1; j < N; j++){
            recover += a * d[j];
          }
        }

        System.out.println(recover);



    }
}




