import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = getInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");

        Map<String,Integer> x = new HashMap<>();
        Map<String,Integer> y = new HashMap<>();

        // map初期化
        for(int i = 0; i < n;i++){
            if(i%2 == 0){
                x.put(s[i], 0);
            }else{
                y.put(s[i], 0);
            }
        }
        // 数カウント
        for(int i = 0;i < n;i++){
            if(i%2 == 0){
                x.put(s[i], x.get(s[i])+1);
            }else{
                y.put(s[i], y.get(s[i])+1);
            }
        }
        // xとyが1個しか無くて、別の値
        if(x.size() == 1 && y.size() == 1 && !s[0].equals(s[1])){
            println(0);
            return;
        }

        // xとyが1個しか無くて、同じ値
        if(x.size() == 1 && y.size() == 1 && s[0].equals(s[1])){
            println(n/2);
            return;
        }

        // 一番多いやつ探す
        String xmax = s[0];
        for(String key : x.keySet()){
            int nowMax = x.get(xmax);
            int current = x.get(key);
            if(nowMax < current){xmax = key;}
        }
        String ymax = s[1];
        for(String key : y.keySet()){
            int nowMax = y.get(ymax);
            int current = y.get(key);
            if(nowMax < current){ymax = key;}
        }

        // 同じ数を指定してたら次に大きい値を再探索する
        if(xmax.equals(ymax)){
            int count = 0;
            // x = y かつxのほうが数が多い場合yの次の数を探す
            if(x.get(xmax) >= y.get(ymax)){
                String old = ymax;
                for(String key : y.keySet()){
                    int nowMax = count;
                    int current = y.get(key);
                    if(nowMax <= current && !key.equals(old)){
                        count = current;
                        ymax = key;
                    }
                }
                // x = y かつyのほうが数が多い場合
            }

            // x = y かつyのほうが数が多い場合xの次の数を探す
            if(x.get(xmax) < y.get(ymax)){
                String old = xmax;
                for(String key : x.keySet()){
                    int nowMax = count;
                    int current = x.get(key);
                    if(nowMax <= current && !key.equals(old)){
                        count = current;
                        xmax = key;
                    }
                }
            }
        }

        // 最頻値以外の数を取得する
        int count = 0;
        count += x.get(xmax);
        count += y.get(ymax);
        println(n - count);
        return;
    }
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
    static String[] split(String val) {return val.split(" ");}
    static List<String> toSortedList(String[] s){ return sortList(Arrays.asList(s));}
    static List<String> sortList(List<String> list){
        Collections.sort(list, Comparator.comparingInt(val -> Integer.parseInt(String.valueOf(val))));
        return list;
    }

    static void println(String val){System.out.println(val);}
    static void println(int val){System.out.println(val);}
    static void println(long val){System.out.println(val);}
}