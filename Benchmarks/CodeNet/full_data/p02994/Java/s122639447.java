import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();

        int[] tastes = new int[N];
        int tasteSum = 0;
        for (int i=0; i<N; i++) {
            tastes[i] = L + i;
            tasteSum += L + i; 
        }

        int absMin = 101;
        int min = 0;
        for (int taste : tastes) {
            if (Math.abs(taste)  < absMin) {
                absMin = Math.abs(taste);
                min = taste;
            }
        }

        System.out.println(tasteSum - min);
    }
}

