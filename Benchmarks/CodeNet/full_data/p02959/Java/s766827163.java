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
        braver.add(0);

        int savings = 0;
        int result = 0;
        for(int i=0; i<=N; i++){
            int broken = Math.min(savings, enemy.get(i));
            result += broken;
            enemy.set(i, enemy.get(i)-broken);
            if(enemy.get(i)<braver.get(i)){
                savings = braver.get(i) - enemy.get(i);
                result += enemy.get(i);
            }else{
                savings = 0;
                result += braver.get(i);
            }
        }
        System.out.println(result);
    }

}