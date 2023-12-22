import java.util.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0;i<n;i++){
            a.add(scanner.nextInt());
        }
        int alice=0;
        int bob=0;
        Collections.sort(a);
        for (int i=0;i<n;i++){
            if (i%2==0){
                alice += a.get(n-i-1);
            }else {
                bob += a.get(n-i-1);
            }
            a.remove(n-i-1);
        }
        System.out.println(alice-bob);

    }

}