import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] L = new int[N+1];
        for(int i = 0; i < N; i++){
            L[i] = sc.nextInt();
        }

        int x = 0;
        int count = 0;
        while(x <= X && count <= N){
            x += L[count];
            count++;
        }

        System.out.println(count);
    }
}