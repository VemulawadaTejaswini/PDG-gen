import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] people = new int[n];

        int minPosition = 100;
        int maxPosition = 1;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val < minPosition) {
                minPosition = val;
            }
            if (val > maxPosition) {
                maxPosition = val;
            }
            people[i] = val;

        }

        int[] staminas = new int[maxPosition - minPosition + 1];

        for (int p = 0; p < staminas.length; p++) {
            for (int i = 0; i < n; i++) {
                staminas[p] += stamina(people[i], p + 1);
            }
        }

        int minValue = staminas[0];
        for (int i = 0; i < staminas.length; i++) {
            if (staminas[i] < minValue) {
                minValue = staminas[i];
            }
        }
        System.out.println(minValue);
    }

    private static int stamina(int personStamina, int meetingIndex) {
        return (int) Math.pow(personStamina - meetingIndex, 2);
    }
}
