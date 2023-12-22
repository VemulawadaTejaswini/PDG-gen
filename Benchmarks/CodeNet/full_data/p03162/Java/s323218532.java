import java.util.Scanner;

public class Main {
    public static int findHappy(
            String activityFromPreviousDay,
            int day,
            int vacationDays,
            int[] A,
            int[] B,
            int[] C) {
        if (day > vacationDays) {
            return 0;
        }
        switch (activityFromPreviousDay) {
            case "A":
                return Math.max(
                        B[day] + findHappy("B", day + 1, vacationDays, A, B, C),
                        C[day] + findHappy("C", day + 1, vacationDays, A, B, C));
            case "B":
                return Math.max(
                        A[day] + findHappy("A", day + 1, vacationDays, A, B, C),
                        C[day] + findHappy("C", day + 1, vacationDays, A, B, C));

            case "C":
                return Math.max(
                        B[day] + findHappy("B", day + 1, vacationDays, A, B, C),
                        A[day] + findHappy("A", day + 1, vacationDays, A, B, C));

            default:
                return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vacationDays = sc.nextInt();
        sc.nextLine();
        int[] A = new int[vacationDays];
        int[] B = new int[vacationDays];
        int[] C = new int[vacationDays];

        for (int i = 0; i < vacationDays; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
        }

        int maxHappy = 0;
        maxHappy = Math.max(
                A[0] + findHappy("A", 1, vacationDays - 1, A, B, C),
                Math.max(
                        B[0] + findHappy("B", 1, vacationDays - 1, A, B, C),
                        C[0] + findHappy("C", 1, vacationDays - 1, A, B, C)));

        System.out.println(maxHappy);
    }
}
