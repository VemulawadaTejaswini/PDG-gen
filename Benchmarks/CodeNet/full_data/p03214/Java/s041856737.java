import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] s = new int[n];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < n ; i++){
            s[i] = sc.nextInt();
            sum += s[i];
        }
        avg = sum / n;

        int min = Math.abs(avg - s[0]);
        int idx = 0;

        for (int i = 1; i < n ; i++){
            int tmp = Math.abs(avg - s[i]);
            if (tmp < min){
                min = tmp;
                idx = i;
            }
        }

        System.out.println(idx);
    }
}