import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {

    private static int N;
    //private static int map[][];
    private static HashMap<Integer , ArrayList<Integer>> hashMap;
    private static ArrayList<Integer> arrayList;
    private static int fennec_count = 0;
    private static int snuke_count = 0;

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        //map = new int[N][N];

        hashMap = new HashMap<>();

        for(int i=0;i<N-1;i++){
            //sからtへの頂点を張る
            int s = 0,t = 0;
            s = scan.nextInt();
            t = scan.nextInt();

            arrayList = new ArrayList<>();   //リストを共有しないように
            // sからtへのパスが一つでも存在していれば
            if(hashMap.containsKey(s)){
                arrayList = hashMap.get(s);
                arrayList.add(t);
                hashMap.put(s,arrayList);
            }else{
                arrayList.add(t);
                hashMap.put(s,arrayList);
            }

            arrayList = new ArrayList<>();   //リストを共有しないように
            // 無向グラフの場合はさらにtにsへの辺を張る
            if(hashMap.containsKey(t)){
                arrayList = hashMap.get(t);
                arrayList.add(s);
                hashMap.put(t,arrayList);
            }else{
                arrayList.add(s);
                hashMap.put(t,arrayList);
            }
        }

        /*int x , y;
        for(int i=0;i<N-1;i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            // 無向グラフ
            map[y - 1][x - 1] = 1;
            map[x - 1][y - 1] = 1;
        }*/
    }

    public static void bfs(ArrayList<Integer> fennec , ArrayList<Integer> snuke){
        //  Fennecの番
        ArrayList<Integer> next_fennec = new ArrayList<>();
        for(int i=0;i<fennec.size();i++) {
            ArrayList<Integer> array = hashMap.get(fennec.get(i));
            if(array.contains(N)) array.remove((Integer) N);
            if(!array.isEmpty()) fennec_count += array.size();
            // 次の点から現在の点に戻ってこないように削除しておく
            for (int j=0;j<array.size();j++){
                hashMap.get(array.get(j)).remove(fennec.get(i));
            }
            next_fennec.addAll(array);
            /*for (int j = 0; j < N; j++) {
                if (map[fennec.get(i)][j] == 1) {
                    map[fennec.get(i)][j] = 2;
                    map[j][fennec.get(i)] = 2;
                    next_fennec.add(j);
                }
            }*/
        }
        //  Snukeの番
        ArrayList<Integer> next_snuke = new ArrayList<>();
        for (int i=0;i<snuke.size();i++){
            ArrayList<Integer> array = hashMap.get(snuke.get(i));
            if(array.contains(1)) array.remove((Integer) 1);
            ArrayList<Integer> temp = (ArrayList<Integer>) array.clone();
            for(int j=0;j<array.size();j++){
                if(next_fennec.contains(array.get(i))) temp.remove(array.get(i));
            }
            if(!temp.isEmpty()) snuke_count += temp.size();
            // 次の点から現在の点に戻ってこないように削除しておく
            for (int j=0;j<temp.size();j++){
                hashMap.get(temp.get(j)).remove(snuke.get(i));
            }
            next_snuke.addAll(temp);
            /*for (int j=0;j<N;j++){
                if(map[snuke.get(i)][j] == 1){
                    if(map[fennec.get(i)][j] == 2){
                        map[snuke.get(i)][j] = 0;
                        map[j][snuke.get(i)] = 0;
                    }
                    else{
                        map[snuke.get(i)][j] = 3;
                        map[j][snuke.get(i)] = 3;
                        next_snuke.add(j);
                    }
                }
            }*/
        }

        if(next_fennec.isEmpty() && next_snuke.isEmpty()) return;
        else bfs(next_fennec , next_snuke);
    }

    public static void main(String args[]){
        //入力
        input();

        ArrayList<Integer> fennec_array = new ArrayList<>();
        fennec_array.add(1);
        ArrayList<Integer> snuke_array = new ArrayList<>();
        snuke_array.add(N);
        bfs(fennec_array , snuke_array);

        // mapの表示 & 勝敗判定
        /*int fennec_count = 0;
        int snuke_count = 0;
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++){
                if(map[i][j] == 2) fennec_count++;
                if(map[i][j] == 3) snuke_count++;
                //System.out.print(map[i][j] + " ");
            }
            //System.out.println();
        }*/

        if(fennec_count > snuke_count) System.out.println("Fennec");
        else System.out.println("Snuke");

    }
}
