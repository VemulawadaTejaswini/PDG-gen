import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int h1 = sc.nextInt();
                int cnt = 0, max = 0, read = 0;
                do {
                        int h2 = sc.nextInt();
                        if(h1 >= h2) cnt++;
                        else cnt = 0;
                        if(max < cnt) max = cnt;
                        h1 = h2;
                        read++;
                } while(read < N - 1);
                sc.close();
                System.out.println(max);
        }
}
