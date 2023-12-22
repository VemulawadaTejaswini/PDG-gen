import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long[] array = new long[N];
        long[] ruiseki = new long[N];

        for(int i=0; i<N; i++){
            array[i] = sc.nextLong();
        }

        long sum = 0;

        Map<Long, List<Long>> map = new HashMap<>();
        for(int i=0; i<N; i++){
            sum += array[i];
            ruiseki[i] = sum;
            long amari = sum % M;

            if(map.keySet().contains(amari)){
                List<Long> tmp = map.get(amari);
                tmp.add((long)i);
                map.put(amari, tmp);
            } else {
                List<Long> list = new ArrayList<>();
                list.add((long)i);
                map.put(amari, list);
            }
        }

        long count = 0;
        long ans = 0;

        if(map.keySet().contains((long)0)) ans += map.get((long)0).size();

        for(List l: map.values()){
            long x = l.size()-1;
            ans += kaijou(x);
        }

        System.out.println(ans);
    }

    long kaijou(long x){
        if(x == 0) return 0;
        else if(x == 1) return 1;
        else return x + kaijou(x-1);
    }
}

//
//class Sinsu {
//    // メインメソッド
//    public static void main(String[] args) {
//        ArrayList<String> num = new ArrayList<String>();
//        int sinsu = 0;
//
//        if (args.length <= 1) {
//            System.out.println("引数が少なすぎるか多すぎます");
//            return;
//        } else {
//            sinsu = Integer.parseInt(args[0]);
//            for (int i = 1; i < args.length; i++) {
//                num.add(args[i]);
//            }
//        }
//
//        for (int i = 0; i < num.size(); i++) {
//            int decimal = 0;
//
//            switch (sinsu) {
//                case 2:
//                    decimal = Integer.parseInt(binaryToDecimal(String.valueOf(num.get(i))));
//                    break;
//
//                case 8:
//                    decimal = Integer.parseInt(num.get(i), 8);
//                    break;
//
//                case 10:
//                    decimal = Integer.parseInt(num.get(i), 10);
//                    break;
//
//                case 16:
//                    decimal = Integer.parseInt(num.get(i), 16);
//                    break;
//            }
//
//            if (i > 0) {
//                System.out.println();
//            }
//
//            System.out.println("2進数："
//                    + decimalToBinary(Integer.toString(decimal)) + "\n"
//                    + "8進数：" + Integer.toOctalString(decimal) + "\n" + "10進数："
//                    + decimal + "\n" + "16進数：" + Integer.toHexString(decimal));
//
//        }
//    }
//
//    // 10進数を2進数に変換
//    public static String decimalToBinary(String num) {
//        String returnText = "";
//        int waru = Integer.parseInt(num); // 計算途中の数
//        int def = Integer.parseInt(num); // 元の数
//        ArrayList<String> binaryKeta = new ArrayList<String>();
//
//        if (waru < 0) {
//            waru = -waru;
//        } else if(waru == 0){
//            return "0";
//        }
//
//        // 2進数に変換
//        while (waru > 0) {
//            binaryKeta.add(Integer.toString(waru % 2));
//            waru /= 2;
//        }
//
//        if (def > -1) {
//            // 正の数の場合は0を追加して出力
//            int kakeru = binaryKeta.size() / 8+1;
//            while(binaryKeta.size() < kakeru*8){
//                binaryKeta.add("0");
//            }
//            for (int i = binaryKeta.size() - 1; i > -1; i--) {
//                returnText += binaryKeta.get(i);
//            }
//        } else {
//            ArrayList<Integer> minus = new ArrayList<Integer>();
//            // 負の数の場合は反転させる
//            for (int i = 0; i < binaryKeta.size(); i++) {
//                switch (binaryKeta.get(i)) {
//                    case "0":
//                        minus.add(1);
//                        break;
//                    case "1":
//                        minus.add(0);
//                        break;
//                }
//            }
//
//            // 桁上りを実行
//            for (int i = 0; i < minus.size(); i++) {
//                if (i == 0) {
//                    minus.set(i, minus.get(i) + 1);
//                    if (minus.get(i) == 2) {
//                        minus.set(i, 0);
//                        if (i + 1 > minus.size() - 1) {
//                            break;
//                        }
//                        minus.set(i + 1, minus.get(i + 1) + 1);
//                    }
//                }
//
//                if (minus.get(i) == 2) {
//                    minus.set(i, 0);
//                    if (i + 1 > minus.size() - 1) {
//                        continue;
//                    }
//                    minus.set(i + 1, (minus.get(i + 1) + 1));
//                }
//            }
//
//            // 足りないビットを補充
//            while (minus.size() < 32) {
//                minus.add(1);
//            }
//
//            // 出力する
//            for (int i = minus.size() - 1; i > -1; i--) {
//                returnText += minus.get(i);
//            }
//        }
//
//        return returnText;
//    }
//
//    //2進数を10進数に変換
//    public static String binaryToDecimal(String num){
//        //ArrayListに値を代入
//        int[] binarySplit = new int[num.length()];
//        boolean minusBool = false;
//        for(int i=0; i<num.length(); i++){
//            binarySplit[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
//        }
//
//        //負の数である場合（最上位のビットが1である場合）
//        if(binarySplit[0] == 1){
//            minusBool = true;
//
//            //ビットを反転させて1の補数を求める
//            for (int i = 0; i < binarySplit.length; i++) {
//                switch (binarySplit[i]) {
//                    case 0:
//                        binarySplit[i] = 1;
//                        break;
//                    case 1:
//                        binarySplit[i] = 0;
//                        break;
//                }
//            }
//
//            // 桁上りを実行
//            for (int i = binarySplit.length-1; i > 0; i--) {
//                if(i==binarySplit.length-1){
//                    binarySplit[i] = binarySplit[i] + 1;
//                    if(binarySplit[i] == 2){
//                        binarySplit[i-1] = binarySplit[i-1]+1;
//                        binarySplit[i] = 0;
//                    }
//                } else if(binarySplit[i] == 2){
//                    binarySplit[i-1] = binarySplit[i-1]+1;
//                    binarySplit[i] = 0;
//                }
//            }
//        }
//
//        //各桁の重みを掛ける
//        int[] decimalSplit = new int[num.length()];
//        for(int i=0; i<binarySplit.length; i++){
//            int a = (binarySplit[i] * (int)Math.pow(2, binarySplit.length-i-1));
//            decimalSplit[i] = a;
//        }
//
//        //重みを掛けた数値の合計を求める
//        int answer = 0;
//        for(int i=0; i<decimalSplit.length; i++){
//            answer += decimalSplit[i];
//        }
//
//        //負の数の場合は符号を反転させる
//        if(minusBool){
//            answer = -answer;
//        }
//
//        return String.valueOf(answer);
//    }
//}