import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            list.add(in.nextInt());
        }
        boolean one = list.contains(1), seven = list.contains(7),nine = list.contains(9), four = list.contains(4);
        if(one && seven && nine && four){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }
    
}