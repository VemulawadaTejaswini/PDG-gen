import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < N; i++){
            l.add(sc.nextInt());
        }
        int max = -1;
        int count = 0;
        for (int i = 0; i < l.size();i++){
            if (l.get(i) >= max){
                count++;
            }
            max = Math.max(max,l.get(i));
        }
        System.out.println(count);
    }
}