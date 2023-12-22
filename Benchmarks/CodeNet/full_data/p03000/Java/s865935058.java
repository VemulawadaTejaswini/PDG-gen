import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int prev = 0;
        int cnt = 0;

        for(int i=0; i<N; i++){
            int diff = scanner.nextInt();
            cnt++;

            if(X < prev + diff ){
               break;
            }

            prev += diff;
        }

        System.out.println(cnt);
    }
}
