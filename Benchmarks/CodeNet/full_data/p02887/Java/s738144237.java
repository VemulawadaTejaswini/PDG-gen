import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String colors = scanner.next();

        if(N == 1){
            System.out.println(1);
        }

        int cnt = 1;
        char prev = colors.charAt(0);

        for(int i=1; i<N; i++){
            if(prev != colors.charAt(i)){
                cnt++;
                prev = colors.charAt(i);
            }
        }

        System.out.println(cnt);

    }

}
