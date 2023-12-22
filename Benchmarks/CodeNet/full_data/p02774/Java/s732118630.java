import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] hairetu = new long[N];

        for(int i = 0; i < N; i++){
          hairetu[i] = Long.parseLong(sc.next());
        }

        ArrayList<Long> array = new ArrayList<>();
        for(int i = 0; i < N; i++){
          for(int j = i; j < N; j++){
            if(i!=j)
              array.add(hairetu[i]*hairetu[j]);
          }
        }
        Collections.sort(array);
        // for(long k: array)
        //   System.out.print(k + " ");
        // System.out.println();
        System.out.println(array.get(K-1));
    }
}