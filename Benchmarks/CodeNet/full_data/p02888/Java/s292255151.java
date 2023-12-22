import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scn.nextInt());
        }

        int total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1 ; j < N ; j++) {
                for (int k = j+1 ; k < N; k++) {
                    int a = L.get(i);
                    int b = L.get(j);
                    int c = L.get(k);
                    if( a<b+c && b<a+c && c<a+b)
                        total = total+1;
                }
            }
        }

        System.out.println(total);
    }
}