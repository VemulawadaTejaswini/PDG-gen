import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < number; i++) {
            hashSet.add(Integer.parseInt(sc.next()));
        }
        System.out.println(hashSet.size());
    }
}
