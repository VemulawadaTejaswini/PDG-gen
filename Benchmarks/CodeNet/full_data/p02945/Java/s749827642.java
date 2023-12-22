
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        
        List<Integer> res_list = new ArrayList<Integer>();
        res_list.add(A+B);
        res_list.add(A-B);
        res_list.add(A*B);
        Collections.sort(res_list, Collections.reverseOrder());
        System.out.println(res_list.get(0));
    }
}