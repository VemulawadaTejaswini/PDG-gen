import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < 3; i++){
            a.add(scan.nextInt());
        }
        System.out.println(a.size());
    }
}