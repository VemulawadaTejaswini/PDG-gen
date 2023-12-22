import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double answer = 0;
        for (int i=1;i<=n;i++){
            long instance = i;
            int count = 0;
            while (true){
                if (instance>=k) break;
                instance *= 2;
                count++;
            }
            answer += Math.pow(0.5,count)/n;
        }
        System.out.println(answer);
    }
}
