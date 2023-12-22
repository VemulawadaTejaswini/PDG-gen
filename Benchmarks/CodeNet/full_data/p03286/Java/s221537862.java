import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; n != 0; i++){
            if (n%2 == 0) {
                list.add(i, 0);;
                n = n + (-1)^i;
                n = n/2;
            }else{
                list.add(i, 1);
                n = n/2;
            }
        }
        for(int j = 0; j < list.size(); j++){
            System.out.print(list.get(j));
        }
        System.out.println();
    }
}