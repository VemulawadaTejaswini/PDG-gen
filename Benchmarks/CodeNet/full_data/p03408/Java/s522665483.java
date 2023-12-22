import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        //標準入力
        int N = sc.nextInt();
        String[] s = new String[N];
        for(int i = 0; i < N; i++) s[i] = sc.next();
        int M = sc.nextInt();
        String[] t = new String[M];
        for(int i = 0; i < M; i++) t[i] = sc.next();

        //青カードの同一文字を総当たりでカウント。
        //次に、文字列の一致する赤カードを総当たりでカウント。
        //その後、差を取得。
        int maxMoney = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            int countBlue = 0;
            int countRed = 0;
            for(int j = 0; j < N; j++){
                if(s[i].equals(s[j])) countBlue++;
            }
            for(int j = 0; j < M; j++){
                if(s[i].equals(t[j])) countRed++;
            }
            if(maxMoney < countBlue - countRed){
                maxMoney = countBlue - countRed;
            }
        }
        System.out.println(maxMoney > 0 ? maxMoney : 0);
    }
}
