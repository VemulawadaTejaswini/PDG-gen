import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(S);
        int num = S;
        while(true) {
            if (num%2 == 0) {
                num = num/2;
                if (list.contains(num))  break;
                list.add(num);
            } else {
                num = num*3+1;
                if (list.contains(num))  break;
                list.add(num);
            }
        }
        System.out.println(list.size()+1);
    }
}