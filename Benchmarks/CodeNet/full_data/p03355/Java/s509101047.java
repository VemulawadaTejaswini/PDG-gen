import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        TreeSet<String> set = new TreeSet<>();
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                set.add(s.substring(i,j+1));
            }
        }
        int i = 0;
        for(String str : set) {
            if(++i==k) {
                System.out.println(str);
                break;
            }
        }
    }
}