import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i<N;i++){
            arr.add(sc.nextInt());
            if(arr.get(i) >= K) {
                C++;
            }
        }
        System.out.println(C);
    }
}
