import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String args[])  {

        HashSet<String> hs = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            hs.add(sc.next());
        }
        System.out.println(hs.size());
    }
}