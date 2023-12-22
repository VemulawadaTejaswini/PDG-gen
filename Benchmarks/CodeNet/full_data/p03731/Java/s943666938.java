import java.util.Scanner;

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int time = sc.nextInt();
        int[] history = new int[count];
        for (int i = 0; i < count; i++) {
            history[i] = sc.nextInt();
        }
        long total = 0;
        long beforeTime = 0;
        long afterTime = 0;
        long diffTime = 0;
        for (int i = 1; i < history.length; i++) {
            beforeTime = history[i - 1];
            afterTime = history[i];
            diffTime = (afterTime - beforeTime);
            if (diffTime < time) {
                total += diffTime;
            } else {
                total += time;
            }
        }
        total += time;
        System.out.println(total);


}