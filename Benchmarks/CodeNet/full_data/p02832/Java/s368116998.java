import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int[] ary = new int[N];
        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.nextInt();
        }
        int broken = 0;
        boolean ok = true;
        while (broken != N) {
            //正解チェック
            int j = 0;
            ok = true;
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] != 0)
                    j++;
                else
                    continue;

                if (ary[i] != j)
                    ok = false;
            }
            if (ok == true)
                break;
            //自分の位置以上の値が書かれていたら砕く
            j = 0;
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] != 0)
                    j++;
                else
                    continue;
                if (ary[i] >= j) {
                    ary[i] = 0;
                    broken++;
                }
            }
        }

        if( broken == N )
            System.out.println(-1);
        else
            System.out.println(broken);
	}
}