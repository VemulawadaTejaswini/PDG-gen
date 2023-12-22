import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        int count = 0;
        for (int i = 0; i < number; i++) {
            for(int j = i; j < number; j++) {
                int sum = 0;
                sum += list.get(j);
                if(sum == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}