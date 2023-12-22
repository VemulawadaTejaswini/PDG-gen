import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        String[] listRestaulant = new String[n];
        String x = kbd.nextLine();
        for (int i = 0; i < n; i++) {
            listRestaulant[i] = kbd.nextLine() + " " + Integer.toString(i + 1);
            // System.out.println(listRestaulant[i]);

        }

        Arrays.sort(listRestaulant);

        String[][] aft = new String[n][3];
        for (int j = 0; j < n; j++) {
            String[] temp = listRestaulant[j].split(" ");
            aft[j] = temp;
        }

        for (int k = 0; k < n; k++) {
            if (k != n - 1 && aft[k][0].equals(aft[k + 1][0])
                    && Integer.parseInt(aft[k][1]) < Integer.parseInt(aft[k + 1][1])) {
                String[] temp = aft[k];
                aft[k] = aft[k + 1];
                aft[k + 1] = temp;
            }

        }
        for (int l = 0; l < n; l++) {
            System.out.println(aft[l][2]);
        }
    }
}