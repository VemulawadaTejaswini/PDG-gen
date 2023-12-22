import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        Restaulant[] listRestaulant = new Restaulant[n];
        String x = kbd.nextLine();
        for (int i = 0; i < n; i++) {
            Restaulant temp = new Restaulant();
            temp.name = kbd.next();
            temp.point = kbd.nextInt();
            temp.index = i + 1;
            listRestaulant[i] = temp;
        }

        Arrays.sort(listRestaulant,
                Comparator.comparing(Restaulant::getName).thenComparingInt(Restaulant::getPoint).reversed());

        Arrays.sort(listRestaulant, Comparator.comparing(Restaulant::getName));
        for (int j = 0; j < n; j++) {
            Restaulant temp = listRestaulant[j];
            System.out.println(temp.getIndex());
        }
    }
}

class Restaulant {
    String name;
    int point;
    int index;

    String getName() {
        return this.name;
    }

    int getPoint() {
        return this.point;
    }

    int getIndex() {
        return this.index;
    }
}
