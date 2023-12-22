import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Az = new int[N];
        int[][] Xz = new int[N][N];
        int[][] Yz = new int[N][N];
        for (int i = 0; i < N; i++) {
            Az[i] = sc.nextInt();
            for (int j = 0; j < Az[i]; j++) {
                Xz[i][j] = sc.nextInt()-1;
                Yz[i][j] = sc.nextInt();
            }
        }
        int maxHonestCnt = 0;
        for (int i = 0; i < (1<<N); i++){
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = 0; j < N; j++){
                if ((1&i>>j)==1){
                    set.add(j);
                }
            }
//            System.out.println(set);
            int[] predz = new int[N];
            Arrays.fill(predz, -1);

            int break_flg = 0;
            int honest_flg = 0;
            for (int j = 0; j < N; j++){
                honest_flg = 0;
                if (!set.contains(j)){ //正直者ならそのまま
                    honest_flg = 1; //正直者なら0
                }
//                System.out.println(j+" "+honest_flg+" aaaaa"+!set.contains(j));
                int thisTimePred = 0;
                for (int h = 0; h < Az[j]; h++) { // 証言の回数分，回す
                    thisTimePred = Math.abs(Yz[j][h] - honest_flg);
//                    if (f (set, j, thisTimePred)){
//                        break_flg = 1;
//                        break;
//                    }
                    if ((predz[Xz[j][h]] == -1) || (predz[Xz[j][h]] == thisTimePred)){ //j番目の人のh個目の証言の対象者がまだ何も言われていないとき,もしくは，別の人の予測と今回の予測が同じとき．
                        predz[Xz[j][h]] = thisTimePred;
                    } else {
                        break_flg = 1;
                        break;
                    }
                }
                if (break_flg == 1){
                    break;
                }
            }
            if (break_flg == 0){
                if (maxHonestCnt < set.size()){
                    maxHonestCnt = set.size();
                }
            }

        }
        System.out.println(maxHonestCnt);
    }

    public static boolean f (HashSet<Integer> set, int j, int thisTimePred){
//        return ((set.contains(j) && (thisTimePred == 0)) || (!set.contains(j) && (thisTimePred == 1)));
        return ((set.contains(j) && (thisTimePred == 1)) || (!set.contains(j) && (thisTimePred == 0)));
    }
}