import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();

        ArrayList<Integer> scoreboard = new ArrayList<>();
        ArrayList<Integer> answers = new ArrayList<>();
        for(int i = 0; i < n; i++) scoreboard.add(k);
        for(int i = 0; i < q; i++) answers.add(scanner.nextInt());
        scanner.close();

        for(int e : answers) decreaseAllExcept(scoreboard, e);
        for(int e : scoreboard) System.out.println(e > 0 ? "Yes" : "No");
    }

    public static void decreaseAllExcept(ArrayList<Integer> arr, int index ) {
        int checkIndex = index - 1;

        for(int i = 0; i < arr.size(); i++){
            if(i != checkIndex){
                arr.set(i, arr.get(i) - 1);
            }
        }
    }
}