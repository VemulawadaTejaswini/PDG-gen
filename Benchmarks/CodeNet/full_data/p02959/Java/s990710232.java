import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> enemy = new ArrayList<>();
        ArrayList<Integer> braver = new ArrayList<>();
        for(int i=0; i<=N; i++){
            enemy.add(scanner.nextInt());
        }
        for(int i=0; i<N; i++){
            braver.add(scanner.nextInt());
        }

        int result= 0;
        for (int i=0; i<N; i++){
            int broken = Math.min(enemy.get(i), braver.get(i));
            result += broken;
            broken = Math.min(enemy.get(i+1), braver.get(i) - broken);
            result += broken;
            enemy.set(i+1, enemy.get(i+1)-broken);
        }
        System.out.println(result);
    }

}