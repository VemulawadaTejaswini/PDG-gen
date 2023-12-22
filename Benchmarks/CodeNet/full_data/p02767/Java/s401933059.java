import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        
        int max = -1;
        int min = 101;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (max < a[i])
                max = a[i];
            
            if(min > a[i])
                min = a[i];
        }

        int hp_min = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            int hp = 0;
            for (int j = 0; j < a.length; j++) {
                hp += Math.pow(a[j] - i, 2);
            }
            if (hp < hp_min) {
                hp_min = hp;
            }
        }

        System.out.println(hp_min);
    }
}