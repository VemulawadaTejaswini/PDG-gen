import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[][] s = new char[N][10];
        List<String> list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            scanner.next().getChars(0, 10, s[i], 0);
            Arrays.sort(s[i]);
            list.add(i, String.valueOf(s[i]));
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                String is = list.get(i);
                String js = list.get(j);
                if(is.equals(js)){
                    count++;
                }
            }
        }


        System.out.println(count);
    }
}