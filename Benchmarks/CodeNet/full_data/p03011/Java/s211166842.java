import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] astr = str.split(" "); //状況に合わせて
        Boolean flag = true;
        int[] in_data = Stream.of(astr).mapToInt(x -> {
            try {
                return Integer.parseInt(x);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }).toArray();
        sc.close();

        int p = in_data[0];
        int q = in_data[1];
        int r = in_data[2];
        int ans =0;

        int max = max(p,q,r);
        if(max == p){
            ans = q + r;
        }
        if(max == q){
            ans = p + r;
        }
        if(max == r){
            ans = p + q;
        }
        System.out.println(ans);
    }

    public static int max(int a,int b,int c){
        int tmp = a;
        if(tmp < b){
            tmp = b;
        }
        if(tmp < c){
            tmp = c;
        }
        return  tmp;
    }
}