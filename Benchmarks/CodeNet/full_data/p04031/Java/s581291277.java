import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int count = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while (count-- > 0) {
                int a = sc.nextInt();
                if (a>max) max=a;
                if (a<min) min=a;
                list.add(a);
            }
            if (max == min) {
                System.out.println(0);
            }else{
                int res=Integer.MAX_VALUE;
                for (int i=min;i<=max;i++) {
                    int minValue = getMinValue(list, i);
                    if (minValue<res) res=minValue;
                }
                System.out.println(res);
            }

        }
    }

    public static int getMinValue(List<Integer> list, int value) {
        int sum=0;
        for (Integer x : list) {
            sum+=(x-value)*(x-value);
        }
        return sum;
    }
}