import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean debug = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        //　親子関係をとりあえず保持しておく
        int p_c[][] = new int[2][n-1];
        for(int i=0;i<n-1;i++){
            p_c[0][i] = sc.nextInt();
            p_c[1][i] = sc.nextInt();
        }

        //ノードに与えられてるスコアを設定する
        HashMap<Integer,Long> scoremap = new HashMap<>();
        for(int i=0;i<q;i++){
            int key = sc.nextInt();
            long value = sc.nextLong();
            if(scoremap.containsKey(key)){
                long temp = scoremap.get(key);
                scoremap.put(key, temp+value);
            }else{
                scoremap.put(key,value);
            }
        }

        //親のノードの値を子のノードに加算していく
        for(int i=0;i<n-1;i++){
            int parent = p_c[0][i];
            int child = p_c[1][i];

            long parent_value = 0;
            if(scoremap.containsKey(parent)) {
                parent_value = scoremap.get(parent);
            }

            if(scoremap.containsKey(child)) {
                long temp = scoremap.get(child);
                scoremap.put(child,temp+parent_value);
            }else {
                scoremap.put(child, parent_value);
            }
        }

//        for(int i=0;i<scoremap.size();i++){
//            long score = scoremap.get(i+1);
//            System.out.print(score + " ");
//        }

        for(int key : scoremap.keySet()){
            long score = scoremap.get(key);
            System.out.print(score + " ");

        }

    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
