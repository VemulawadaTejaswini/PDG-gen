import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        ArrayList<String> ar = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ar.add(sc.next());
        }
        Collections.sort(ar);
        for(String st: ar)
            System.out.printf("%s", st);
        System.out.println();
    }
}