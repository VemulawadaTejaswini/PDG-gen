import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        HashMap<Integer, Integer> mapping = new HashMap<>();
        mapping.put(1,1);
        mapping.put(3,1);
        mapping.put(5,1);
        mapping.put(7,1);
        mapping.put(8,1);
        mapping.put(10,1);
        mapping.put(12,1);
        mapping.put(4,2);
        mapping.put(6,2);
        mapping.put(9,2);
        mapping.put(11,2);
        mapping.put(2,3);
        int x = scan.nextInt();
        int y = scan.nextInt();
        boolean answer = mapping.get(x) == mapping.get(y);
        System.out.println(answer ? "Yes" : "No");
    }
}
