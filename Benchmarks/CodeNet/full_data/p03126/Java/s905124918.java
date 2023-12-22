import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> last = new ArrayList<>();

        Parent:for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int index = 0; index < k; index++) {
                if (i == 0) {
                    last.add(sc.nextInt());
                } else {
                    list.add(sc.nextInt());
                    if (index == k - 1) {
                        ArrayList<Integer> mastered = new ArrayList<>();
                        for (int inner = 0; inner < last.size(); inner++) {
                            int value = last.get(inner);
                            if (list.contains(value)) {
                                mastered.add(value);
                            }
                        }
                        last = mastered;
                        if (last.size() == 0) {
                            break Parent;
                        }
                    }
                }
            }
        }

        // 出力
        System.out.println(last.size());
    }
}