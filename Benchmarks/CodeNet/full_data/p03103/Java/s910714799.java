import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static class Drink {
        long a;
        int b;

        public Drink(long a, int b) {
            this.a = a;
            this.b = b;
        }

        public long getA() {
            return a;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Drink> drink = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            drink.add(new Drink(sc.nextLong(), sc.nextInt()));
        }
        long yen = 0;
        int count = 0;
        drink.sort(Comparator.comparing(Drink::getA));

        for (int i = 0; i < drink.size(); i++) {
            for (int j = 0; j < drink.get(i).b; j++) {
                yen += drink.get(i).a;
                count++;
                if (count >= m) {
                    System.out.println(yen);
                    return;
                }
            }
        }
    }

}
