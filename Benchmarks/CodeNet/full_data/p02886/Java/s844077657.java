import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        ArrayList<Integer> D = new ArrayList<>();
        for(int i = 0;i<N;i++){
            D.add(scn.nextInt());
        }
        int health =0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i+1 ; j < N ; j++) {
                health = D.get(i) * D.get(j);
                total = total + health;
            }
        }
        System.out.println(total);
    }
}