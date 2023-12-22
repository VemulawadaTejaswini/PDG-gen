import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int max =0,min=999999999;
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            int b_num = num - (i+1);
            List.add(b_num);
            if(max<b_num) max = b_num;
            if(min>b_num) min = b_num;
        }
        int sum = 999999999;
        for(int i=min;i<=max;i++){
            int sum2=0;
            for(int j=0;j<List.size();j++) sum2+= Math.abs(List.get(j)-i);
            if(sum2<sum) sum = sum2;
        }
        System.out.println(sum);
    }
}
