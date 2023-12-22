import java.math.BigDecimal;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int l = Integer.parseInt(s.split(" ")[0]);
        int r = Integer.parseInt(s.split(" ")[1]);

        int[] temp = new int[5000];
        for(int i = 0; i < temp.length; i++){
            temp[i] = 10000;
        }

        for(int i = l; i <= r && i <= l + 5000; i++){
            temp[i] = i % 2019;
        }

        Arrays.sort(temp);

        System.out.println(temp[0] * temp[1]);
        return;
    }
}
