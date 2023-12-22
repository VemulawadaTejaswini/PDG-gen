import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getInt(sc.nextLine());

        // エラトステネスの篩
        // https://gist.github.com/greymd/19ed7f18c0eba7e703ac2a6b69225ca8
        List list = new ArrayList<Integer>();
        IntStream.rangeClosed(2, 100000)
                .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                        .allMatch(j -> i%j !=0))
                .forEach(x -> {
                    list.add(x);
                });

        // 素数リストにマッチした要素の数をカウントする
        for (int i = 0;i < n;i++){
            String[] line = sc.nextLine().split(" ");
            int l = Integer.parseInt(line[0]);
            int r = Integer.parseInt(line[1]);
            long count = list.stream().filter(x -> l <= (int)x && (int)x <= r && contains(list,(int)x) && contains(list,((int)x+1)/2) ).count();
            System.out.println(count);
        }
        sc.close();
    }
    static int getInt(String val) {
        return Integer.parseInt(val);
    }
    static boolean contains(List list,int arg){
        return list.stream().filter(x-> (int)x == arg).count() > 0;
    }
}