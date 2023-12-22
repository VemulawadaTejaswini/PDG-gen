import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mochis = new int[n];
        for(int i = 0; i < n; i++){
            mochis[i] = sc.nextInt();
        }

        List<Integer> distinctArray = new ArrayList<Integer>();
        for(int mochi :mochis){
            if(!distinctArray.contains(mochi)){
                distinctArray.add(mochi);
            }
        }

        System.out.println(distinctArray.size());
        sc.close();
    }

}
